package com.jd.Module.SearchListCommonModule.service.impl;

import com.jd.Module.SearchListCommonModule.service.ISearchListCommonService;
import com.jd.VO.commonVO.commonVo;
import com.jd.mapper2.mapper类顶层注入接口;
import com.jd.util.Common_page_listUtils.Common_shop_messageUtil;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

@Service
@Transactional
public class SearchListCommonServiceImpl<T> implements ISearchListCommonService {

    private String Alias = "com.jd.mapper2.";
    private String Pojo2 = "com.jd.pojo2.";

    @Autowired
    private List<mapper类顶层注入接口> inters;


//    @Autowired
//    private ServiceLocator ServiceLocator;

    public mapper类顶层注入接口 get(String className) {
        String tar_mapper_name = Alias + className;
//        mapper类顶层注入接口 tar_mapper = null;
//        Map<String, mapper类顶层注入接口> map = ServiceLocator.getMap();
//        Set<String> strings = map.keySet();
//        ImmutableSet<String> set1 = ImmutableSet.copyOf(strings);
//        Set<String> collect = set1.stream()
//                .limit(set1.size() - 1)
//                .collect(Collectors.toSet());

//        String class_name = null;

        for (mapper类顶层注入接口 temp : inters) {
            // 获取mapper代理类的实际类的全限定名
            Type[] genericInterfaces = AopUtils.getTargetClass(temp).getGenericInterfaces();
            String typeName = genericInterfaces[0].getTypeName();
            if (tar_mapper_name.equalsIgnoreCase(typeName)) {
                return temp;
            }
        }
        throw new RuntimeException("输入的mapper全限定名有误");
    }

    @Override
    public List<commonVo> getAll(int page, String mapperName) {
        mapper类顶层注入接口 mapper = get(mapperName);
//        BigBangongMapper
        String example_name = Pojo2 + mapperName.replace("Mapper", "Example");

        Object o = null;

        try {
            Class<?> aClass = Class.forName(example_name);
            o = aClass.newInstance();
            Method setLeftLimit = aClass.getMethod("setLeftLimit", Integer.class);
            Method setLimitSize = aClass.getMethod("setLimitSize", Integer.class);
            setLeftLimit.invoke(o, (page - 1) * 60);
            setLimitSize.invoke(o, 60);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("未知异常");
        }

        List list = mapper.selectCascadeByExample(o);
        if (list.size() == 0) {
            List list1 = mapper.selectByExample(o);
            return list1;
        }
        Common_shop_messageUtil.addShopMessageList(list);
        return list;

    }

    @Override
    public Long getCount(String mapperName) {
        mapper类顶层注入接口 bigBangongMapper = get(mapperName);

        String example_name = Pojo2 + mapperName.replace("Mapper", "Example");

        Object o = null;

        try {
            Class<?> aClass = Class.forName(example_name);
            o = aClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("未知异常");
        }

        long l = bigBangongMapper.countByExample(o);
        return l;
    }
}

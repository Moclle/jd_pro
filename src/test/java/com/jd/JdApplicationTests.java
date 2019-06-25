package com.jd;

import com.google.common.collect.Lists;
import com.jd.VO.commonVO.commonVo;
import com.jd.mapper2.BigBangongMapper;
import com.jd.pojo2.BigBangongExample;
import com.jd.pojo2.SmallBangong;
import com.jd.util.Common_page_listUtils.Common_shop_messageUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdApplicationTests {

    @Autowired
    private BigBangongMapper bigBangongMapper;

    @Test
    public void contextLoads() {
        System.out.printf("我就看看可以提交成功不");
        System.out.printf("测试——将私有变为公有后能否继续使用原来的git配置");
    }

    @Test
    public final void givenList_whenParitioningIntoNSublistsUsingGroupingBy_thenCorrect() {
        List<Integer> intList = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        List<List<Integer>> subSets = Lists.partition(intList, 3);

        List<Integer> lastPartition = subSets.get(2);
        List<Integer> expectedLastPartition = Lists.<Integer>newArrayList(7, 8);
    }
    @Test
    public void hasjd(){
        double q = Math.floor(Math.random() * 10 + 1);
        double w = Math.floor(Math.random() * 10 + 1);
        double e = Math.floor(Math.random() * 10 + 1);
        double r = Math.floor(Math.random() * 10 + 1);
        double t = Math.floor(Math.random() * 10 + 1);
        double y = Math.floor(Math.random() * 10 + 1);

    }

    @Test
    public void bigBangongMapperTest(){
        BigBangongExample example = new BigBangongExample();
        example.setLeftLimit(1);
        example.setLimitSize(60);
        List<commonVo<SmallBangong>> commonVos = bigBangongMapper.selectCascadeByExample(example);
        Common_shop_messageUtil.addShopMessageList(commonVos);
        commonVos.stream()
                .forEach(System.out::println);
    }

    @Test
    public void 测试mapper顶层注入接口(){

    }
}

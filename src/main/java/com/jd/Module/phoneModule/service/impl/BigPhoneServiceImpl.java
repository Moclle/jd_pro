package com.jd.Module.phoneModule.service.impl;

import com.jd.Module.phoneModule.service.IBigPhoneService;
import com.jd.VO.PhoneVo.PhoneBigAndSmallVO;
import com.jd.mapper.BigPhoneMapper;
import com.jd.pojo.BigPhoneExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BigPhoneServiceImpl implements IBigPhoneService {


    @Autowired
    private BigPhoneMapper mapper;

    @Override
    public List<PhoneBigAndSmallVO> getAll(int page) {
        BigPhoneExample bigPhoneExample = new BigPhoneExample();
        bigPhoneExample.setLeftLimit((page - 1) * 60);
        bigPhoneExample.setLimitSize(60);
        List<PhoneBigAndSmallVO> phoneBigAndSmallVOS = mapper.selectCascadeByExample(bigPhoneExample);
        ArrayList<Object> objects = null;
        for (PhoneBigAndSmallVO item : phoneBigAndSmallVOS) {
            objects = new ArrayList<>();
            // //mall.jd.com/index-1000000127.htmlApple产品京东自营旗舰店Apple产品京东自营旗舰店
            String shopMessage = item.getShopMessage();
            if (shopMessage == null || "".equalsIgnoreCase(shopMessage)) {
                objects.add("http://www.baidu.com");
                objects.add("百度一下吧");
                objects.add("百度一下吧");
                item.setShopList(objects);
                continue;
            }
            String[] strArr1 = shopMessage.split(".html");
            String[] strArr2 = strArr1[1].split("店");
//            System.out.printf("这是卖家的三条消息...店铺地址===>%s\r\n店铺名字%s\r\n店铺鼠标悬停名字%s\r\n", strArr1[0]
//                    , strArr2[0], strArr2[1]);

            objects.add("https:" + strArr1[0] + ".html");
            objects.add(strArr2[0]);
            objects.add(strArr2[1]);
            item.setShopList(objects);
        }
        return phoneBigAndSmallVOS;
    }

    @Override
    public Long getCount() {
        return mapper.countByExample(new BigPhoneExample());
    }
}

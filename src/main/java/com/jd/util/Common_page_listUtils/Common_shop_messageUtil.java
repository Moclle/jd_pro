package com.jd.util.Common_page_listUtils;

import com.jd.VO.commonVO.commonVo;

import java.util.ArrayList;
import java.util.List;

public class Common_shop_messageUtil {


    public static <T> void addShopMessageList(List<commonVo<T>> tar) {
        ArrayList<Object> objects = null;
        for (commonVo item : tar) {
            objects = new ArrayList<>();
            try {
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
                try {
                    if (strArr2.length != 1) {
                        objects.add("https:" + strArr1[0] + ".html");
                        objects.add(strArr2[0]);
                        objects.add(strArr2[1]);
                        item.setShopList(objects);
                    } else {
                        String[] 专区s = strArr1[1].split("专区");
                        if (专区s.length == 1) {
                            String[] 出版社s = strArr1[1].split("出版社");
                            if (出版社s.length == 1) {
                                String[] 绘本馆s = strArr1[1].split("绘本馆");
                                objects.add("https:" + strArr1[0] + ".html");
                                objects.add(绘本馆s[0]);
                                objects.add(绘本馆s[1]);
                                item.setShopList(objects);
                            } else {
                                objects.add("https:" + strArr1[0] + ".html");
                                objects.add(出版社s[0]);
                                objects.add(出版社s[1]);
                                item.setShopList(objects);
                            }
                        } else {
                            objects.add("https:" + strArr1[0] + ".html");
                            objects.add(专区s[0]);
                            objects.add(专区s[1]);
                            item.setShopList(objects);
                        }
                    }
                } catch (Exception e) {
                    objects.add("http://www.baidu.com");
                    objects.add("百度一下吧");
                    objects.add("百度一下吧");
                    item.setShopList(objects);
                    continue;
                }
            } catch (Exception e) {
                item.setShopList(null);
                System.out.println("？？？xgsb");
                continue;
            }

        }
    }

}

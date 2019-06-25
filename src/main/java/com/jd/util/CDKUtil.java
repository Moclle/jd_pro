package com.jd.util;

public class CDKUtil {

    public static String getEmailCDK(int num) {
        StringBuffer CDK = new StringBuffer();
        for (int i = 0; i < num; i++) {
//            CDK = CDK + "" + Math.ceil(Math.random() * 10 + 1) + "";
            CDK.append((int)(Math.random() * 10 ));
        }
        String s = CDK.toString();
        return s;
    }

}

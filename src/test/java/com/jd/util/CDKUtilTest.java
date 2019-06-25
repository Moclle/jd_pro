package com.jd.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CDKUtilTest {

    @Test
    public void getEmailCDK() {
        String emailCDK = CDKUtil.getEmailCDK(6);
        System.out.println(emailCDK);

    }
}
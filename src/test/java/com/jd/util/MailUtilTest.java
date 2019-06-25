package com.jd.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailUtilTest {

    @Autowired
    private JavaMailSender javaMailSender;


    //读取配置文件中的参数
    @Value("${spring.mail.username}")
    private String sender;
//719097516
    private static final String recipient = "854250234@qq.com";

    /**
     * 发送简单文本邮件
     */
    @Test
    public void sendSimpleEmail() {
        SimpleMailMessage message = new SimpleMailMessage();
        // 发送者
        message.setFrom(sender);
        // 接收者
        message.setTo(recipient);
        //邮件主题
        message.setSubject("主题：文本邮件");
        // 邮件内容
        message.setText("骚扰邮件勿回1");
        javaMailSender.send(message);
    }
}

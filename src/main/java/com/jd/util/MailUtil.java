package com.jd.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailUtil {


    private static JavaMailSender javaMailSender;

    @Autowired
    public MailUtil(JavaMailSender javaMailSender) {
        MailUtil.javaMailSender = javaMailSender;
    }

    private static String sender;

    //读取配置文件中的参数
    @Value("${spring.mail.username}")
    public void setSender(String sender) {
        this.sender = sender;
    }
    //719097516
    //private static final String recipient = "854250234@qq.com";

    /**
     * 发送简单文本邮件
     */
    public static void sendSimpleEmail(String recipient) {
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

    /**
     * 发送激活邮件
     */
    public static void sendHtmlEmail(String recipient,Object o) {
        MimeMessage message = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(sender);
            helper.setTo(recipient);
            helper.setSubject("主题：激活邮件");
            StringBuffer sb = new StringBuffer();
            sb.append("<h1>兄弟,你号没了</h1>")
                    .append("<p style='color:#F00'>"+o+"</p>");
            helper.setText(sb.toString(), true);
        } catch (MessagingException e) {
            throw new RuntimeException("Messaging  Exception !", e);
        }
        javaMailSender.send(message);
    }

}

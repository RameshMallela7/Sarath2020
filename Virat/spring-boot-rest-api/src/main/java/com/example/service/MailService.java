package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MailService {

    @Autowired
    public JavaMailSender javaMailSender;

    public String sendMail() {
        log.info("start sendMail");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("sarathbabu.nasika7@gmail.com");
        message.setSubject("Spring boot application");
        message.setText("Good night Sarath");
        javaMailSender.send(message);
        log.info("end sendMail");
        return "email sent successfully";
    }
}

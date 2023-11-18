package com.example.scheduler;

import com.example.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduleTask {

    @Autowired
    public MailService mailService;

    @Scheduled(cron = "${cron.expression}")
    public void scheduleTask() {
        log.info("start scheduleTask");
        String result = mailService.sendMail();
        log.info("end scheduleTask : {}", result);
    }
}

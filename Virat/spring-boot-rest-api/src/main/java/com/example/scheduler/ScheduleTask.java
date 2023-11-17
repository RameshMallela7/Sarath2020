package com.example.scheduler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ScheduleTask {

    @Scheduled(cron = "${cron.expression}")
    public void scheduleSomeTask() {
        log.info("Hai");
    }
}

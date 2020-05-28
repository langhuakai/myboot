package com.wei.spring.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScoreService {

    @Async
    public void addScore() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.warn("增加结束-----------");
    }

    @Async("scorePoolTaskExecutor")
    public void addScore2() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.warn("增加结束-----------");
    }
}

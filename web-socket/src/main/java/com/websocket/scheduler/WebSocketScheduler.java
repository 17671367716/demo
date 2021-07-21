package com.websocket.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WebSocketScheduler {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Scheduled(cron = "0/10 * * * * ?")
    public void blockPush(){

        System.out.println("123456");
        simpMessagingTemplate.convertAndSend("/topic/block","112");

    }

}

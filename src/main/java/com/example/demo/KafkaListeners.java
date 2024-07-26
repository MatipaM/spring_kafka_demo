package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners{

    @KafkaListener(
            topics="topic1",
    groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: "+data);
    }

}

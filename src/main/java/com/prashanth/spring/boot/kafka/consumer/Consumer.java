package com.prashanth.spring.boot.kafka.consumer;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
public class Consumer {

    @KafkaListener(topics = "channels", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info(String.format("Consumed message -> %s", message));
    }
}

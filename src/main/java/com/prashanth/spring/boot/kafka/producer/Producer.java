package com.prashanth.spring.boot.kafka.producer;

import com.prashanth.spring.boot.kafka.model.Channel;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Producer {

    private static final String TOPIC = "channel";

    @Autowired
    private KafkaTemplate<String, Channel> kafkaTemplate;

    public void sendMessage(String channel) {
        log.info(String.format("Producing message -> %s", channel));
        this.kafkaTemplate.send(TOPIC, new Channel(1, channel));
    }
}

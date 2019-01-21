package com.prashanth.spring.boot.kafka.controller;

import com.prashanth.spring.boot.kafka.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    @Autowired
    KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/publish/{channel}")
    public String sendMessageToKafkaTopic(@PathVariable("channel") String channel) {
        this.producer.sendMessage(channel);
        return "Published!";
    }
}

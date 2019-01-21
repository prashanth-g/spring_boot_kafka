package com.prashanth.spring.boot.kafka.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Channel {

    private int id;
    private String name;

    public Channel(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

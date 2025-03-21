package com.helloworld.HelloWordProject.model;

import lombok.Getter;

@Getter
public class Holiday {

    private final String day;
    private final String reason;
    private final Type type;

    public enum Type {
        FESTIVAL, FEDERAL;
    }

    public Holiday(String day, String reason, Type type) {
        this.day = day;
        this.reason = reason;
        this.type = type;
    }

}

package org.example.crm_spring.enums;

import lombok.Getter;

@Getter
public enum Gender {
    MALE("on"),
    FEMALE("off"),
    OTHER("other");

    private final String value;

    Gender(String value){
        this.value=value;
    }

}

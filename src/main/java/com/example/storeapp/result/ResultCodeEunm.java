package com.example.storeapp.result;

import lombok.Getter;

@Getter
public enum ResultCodeEunm {

    SUCCESS(200,"成功"),
    FALL(201,"失败"),
    NOTSUFFICIENT(202,"余额不足");

    private Integer code;
    private String message;

    private ResultCodeEunm(Integer code,String message){
        this.code = code;
        this.message = message;
    }
}

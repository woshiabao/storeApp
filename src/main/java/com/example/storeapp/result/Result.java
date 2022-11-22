package com.example.storeapp.result;

import lombok.Data;

@Data
public class Result<T> {

    //返回码
    private Integer code;

    //返回消息
    private String message;

    //返回数据
    private T data;

    public Result(){}

    protected static <T> Result<T> build(T data){
        Result<T> result = new Result<>();
        if(data != null)
            result.setData(data);
        return result;
    }

    protected static <T> Result<T> build(T body, ResultCodeEunm resultCodeEunm){
        Result<T> result = build(body);
        result.setCode(resultCodeEunm.getCode());
        result.setMessage(resultCodeEunm.getMessage());
        return result;
    }

    protected static <T> Result<T> build(Integer code,String message){
        Result<T> result = build(null);
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static <T> Result<T> ok(){return Result.ok(null);}

    //操作成功
    public static<T> Result<T> ok(T data){
        Result<T> result = build(data);
        return build(data,ResultCodeEunm.SUCCESS);
    }

    public static <T> Result<T> fail(){return Result.fail(null);}

    //操作失败
    public static<T> Result<T> fail(T data){
        Result<T> result = build(data);
        return build(data,ResultCodeEunm.FALL);
    }

    public static <T> Result<T> notmoney(){return Result.notmoney(null);}

    public static<T> Result<T> notmoney(T data){
        Result<T> result = build(data);
        return build(data,ResultCodeEunm.NOTSUFFICIENT);
    }
}

package com.hqyj.util;

import java.io.Serializable;

/**
 * 响应结果类
 *
 * @param <T>
 */
public class ResponseResult<T> implements Serializable {
    //属性
    private T data;     //数据
    private String message; //消息
    private Integer code;   //状态码

    //私有的不带参数的构造方法
    private ResponseResult() {

    }

    //私有的全参构造方法
    private ResponseResult(T data, String message, Integer code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    /**
     * 响应成功，不带数据；消息为：成功，状态码为：200
     *
     * @return
     */
    public static ResponseResult success() {
        return new ResponseResult(null, "成功", 200);
    }

    /**
     * 响应成功，传递自定义数据；消息为：成功，状态码为：200
     *
     * @return
     */
    public static <T> ResponseResult success(T data) {
        return new ResponseResult(data, "成功", 200);
    }

    /**
     * 响应成功，不带数据，自定义消息和状态码
     *
     * @param message 消息
     * @param code    状态码
     * @param <T>
     * @return
     */
    public static <T> ResponseResult success(String message, Integer code) {
        return new ResponseResult(null, message, code);
    }

    /**
     * 响应成功，带自定义数据、消息和状态码
     *
     * @param data    数据
     * @param message 消息
     * @param code    状态码
     * @param <T>
     * @return
     */
    public static <T> ResponseResult success(T data, String message, Integer code) {
        return new ResponseResult(data, message, code);
    }

    /**
     * 响应失败：消息为 失败 状态码为 300
     *
     * @return
     */
    public static ResponseResult failed() {
        return new ResponseResult(null, "失败", 300);
    }

    /**
     * 响应失败，自己指定消息和错误码
     *
     * @param message
     * @param code
     * @return
     */
    public static ResponseResult failed(String message, Integer code) {
        return new ResponseResult(null, message, code);
    }

    //getter&setter
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}


package com.mall.user.common.api;

import lombok.Data;

/**
 * 通用返回对象
 * Created by Alvin on 2020/5/8
 */
@Data
public class CommonResult<T> {
    private long code;
    private String message;
    private T data;

    protected CommonResult(){
    }

    protected CommonResult(long code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     * @param <T>
     * @return
     */
    public static <T> CommonResult success(T data){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(),ResultCode.SUCCESS.getMessage(),data);
    }

    /**
     * 成功返回结果
     * @param data 获取的数据
     * @param message 提示信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> success(T data, String message){
        return new CommonResult<T>(ResultCode.SUCCESS.getCode(), message,data);
    }

    /**
     * 失败返回结果
     * @param message 提示信息
     * @param <T>
     * @return
     */
    public static <T> CommonResult<T> failed(String message){
        return new CommonResult<T>(ResultCode.FAILED.getCode(), message,null);
    }

    /**
     * 失败返回结果
     */
    public static <T> CommonResult<T> failed() {
        return failed(ResultCode.FAILED.getMessage());
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> CommonResult<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED.getMessage());
    }

    /**
     * 参数验证失败返回结果
     * @param message 提示信息
     */
    public static <T> CommonResult<T> validateFailed(String message) {
        return new CommonResult<T>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> CommonResult<T> unauthorized(T data) {
        return new CommonResult<T>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> CommonResult<T> forbidden(T data) {
        return new CommonResult<T>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }

}

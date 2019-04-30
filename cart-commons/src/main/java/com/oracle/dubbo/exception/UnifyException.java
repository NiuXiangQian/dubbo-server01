package com.oracle.dubbo.exception;

/**
 * @Description: 统一抛出的异常
 * @Author: 牛向前
 * @CreateDate: 2019/4/3 9:04
 * @UpdateUser: 牛向前
 * @UpdateDate: 2019/4/3 9:04
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class UnifyException extends Exception {
    public UnifyException() {
        super("系统繁忙:");
    }

    public UnifyException(String message) {
        super(message);
    }
}

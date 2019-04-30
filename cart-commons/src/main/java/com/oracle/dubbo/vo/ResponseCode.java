package com.oracle.dubbo.vo;

/**
 * @Description: 定义响应的状态码以及错误信息
 * @Author: 牛向前
 * @CreateDate: 2019/2/28 22:12
 * @UpdateUser: 牛向前
 * @UpdateDate: 2019/2/28 22:12
 * @UpdateRemark:
 * @Version: 1.0
 **/
public enum ResponseCode {


    /* 成功*/
    SUCCESS(0, "success"),
    /* 服务器异常*/
    SERVER_ERROR(1, "服务器繁忙"),
    /* 数据没找到*/
    DATA_NOT_FOUND(2, "没有找到相关内容"),
    /* 请求错误*/
    REQUEST_ERROR(3, "请求错误"),
    /* 自定义异常抛出*/
    CUSTOMER_EXCEPTION(4, "自定义异常抛出"),
    /* 权限不足*/
    NO_PERMISSION(-1, "权限不足");

    /* 错误码*/
    private int code;
    /* 错误信息*/
    private String desc;


    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

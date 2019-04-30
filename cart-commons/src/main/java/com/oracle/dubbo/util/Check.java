package com.oracle.dubbo.util;


import com.oracle.dubbo.exception.UnifyException;

/**
 * @Description: 检查类
 * @Author: 牛向前
 * @CreateDate: 2019/4/3 20:18
 * @UpdateUser: 牛向前
 * @UpdateDate: 2019/4/3 20:18
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class Check {


    /**
     * @Description: 检查是否为空 传入自定义消息
     * @Author: 牛向前
     * @Param: [obj, errorMsg]
     * @Return void
     **/
    public static void isNull(Object obj, String errorMsg) throws UnifyException {
        if (obj == null)
            throw new UnifyException(errorMsg);
    }

    /**
     * @Description: 检查是否为空
     * @Author: 牛向前
     * @Param: [obj]
     * @Return void
     **/
    public static void isNull(Object obj) throws UnifyException {
        isNull(obj, "不能为空");
    }

    /**
     * @Description: 检查是否为空
     * @Author: 牛向前
     * @Param: [obj]
     * @Return void
     **/
    public static void isNulls(Object... obj) throws UnifyException {
        isNull(obj, "不能为空");
    }

    /**
     * @Description: 检查是否为空
     * @Author: 牛向前
     * @Param: [obj]
     * @Return void
     **/
    public static void isNulls(String errorMsg, Object... obj) throws UnifyException {
        isNull(obj, errorMsg);
        for (Object o : obj) {
            isNull(o, errorMsg);
        }
    }


}

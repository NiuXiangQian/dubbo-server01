package com.oracle.dubbo.vo;


/**
 * @Description: 封装服务器返回的json数据
 * @Author: 牛向前
 * @CreateDate: 2019/2/28 22:12
 * @UpdateUser: 牛向前
 * @UpdateDate: 2019/2/28 22:12
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class ServerResponse<T> {


    // 是否成功
    private boolean success;
    // 状态码
    private int statuCode;
    // 错误信息
    private String errorMsg;
    // 所携带的数据
    private T data;
    // 时间戳
    private long timestamp = System.currentTimeMillis();

    /* 构造函数*/

    /**
     * 操作失败返回数据
     */
    public ServerResponse(int statuCode, String errorMsg, T data) {
        this.statuCode = statuCode;
        this.errorMsg = errorMsg;
        this.data = data;
    }

    /**
     * 操作失败不返回数据
     */
    public ServerResponse(int statuCode, String errorMsg) {
        this.statuCode = statuCode;
        this.errorMsg = errorMsg;
    }

    /**
     * @Description: 操作成功返回数据
     * @Author: 牛
     * @Param: [statuCode, data]
     * @Return
     **/

    public ServerResponse(int statuCode, T data) {
        this.success = true;
        this.statuCode = statuCode;
        this.data = data;
    }

    /**
     * 失败返回错误信息 自定义错误码
     */
    public static <T> ServerResponse<T> createByException(ResponseCode responseCode, String errorMsg) {
        if (responseCode != null)
            return createByException(responseCode.getCode(), errorMsg);
        return createByException(ResponseCode.SERVER_ERROR, errorMsg);
    }

    /**
     * 失败返回错误信息 自定义错误码
     */
    public static <T> ServerResponse<T> createByException(ResponseCode responseCode) {
        if (responseCode != null) {
            return new ServerResponse<T>(responseCode.getCode(), responseCode.getDesc());
        }
        return createByException(ResponseCode.SERVER_ERROR);
    }

    /**
     * 成功返回数据
     */
    public static <T> ServerResponse<T> createBySuccess(T data) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(), data);
    }

    /**
     * 成功返回数据
     */
    public static <T> ServerResponse<T> createBySuccess(ResponseCode responseCode, T data) {
        return new ServerResponse<T>(responseCode.getCode(), data);
    }

    /**
     * 失败返回错误信息 自定义错误码
     */
    public static <T> ServerResponse<T> createByException(Integer code, String errorMsg) {
        return new ServerResponse<T>(code, errorMsg);
    }

    /**
     * 失败返回错误信息
     */
    public static <T> ServerResponse<T> createByException(String errorMsg) {
        return createByException(ResponseCode.SERVER_ERROR, errorMsg);
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public int getStatuCode() {
        return statuCode;
    }

    public void setStatuCode(int statuCode) {
        this.statuCode = statuCode;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}

package com.oracle.dubbo.model;

import java.io.Serializable;

public class SysUser implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String loginName;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
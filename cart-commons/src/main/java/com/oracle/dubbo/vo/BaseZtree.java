package com.oracle.dubbo.vo;


/**
 * @Description: 基本的ztree数据格式
 * @Author: 牛向前
 * @CreateDate: 2019/3/27 19:54
 * @UpdateUser: 牛向前
 * @UpdateDate: 2019/3/27 19:54
 * @UpdateRemark:
 * @Version: 1.0
 **/
public class BaseZtree {
    private Long id;
    private String name;
    private Long pId;
    private boolean open;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}

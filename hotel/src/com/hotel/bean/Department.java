package com.hotel.bean;

public class Department {
    /**
     *部门编号
     */
    private int dId;
    /**
     *部门名称
     */
    private String dName;
    /**
     * 部门地址
     */
   private String dAddr;

    /**
     * 备注
     */
    private String remark;
    /**
     *部门无参构造
     */
    public Department() {
    }
    /**
     *部门全参构造
     */
    public Department(int dId, String dName, String dAddr, String remark) {
        this.dId = dId;
        this.dName = dName;
        this.dAddr = dAddr;
        this.remark = remark;
    }

    @Override
    public String toString() {
        return dName;
    }

    /**
     *get set 方法
     */
    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }


    public String getdAddr() {
        return dAddr;
    }

    public void setdAddr(String dAddr) {
        this.dAddr = dAddr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

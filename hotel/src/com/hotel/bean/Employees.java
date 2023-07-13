package com.hotel.bean;

import java.util.Date;

/**
 * @author gmx
 * 员工类
 * zyz添加属性
 * @version 2.0
 */
public class Employees {
    /**
     * 员工编号
     */
    private int eId;
    /**
     * 员工姓名
     */
    private String eName;
    /**
     * 性别
     */
    private String eSex;
    /**
     * 年龄
     */
    private int eAge;
    /**
     * 电话
     */
    private String eTel;
    /**
     * 生日
     */
    private Date eBirthday;
    /**
     * 地址
     */
    private String eAddr;
    /**
     * 部门表
     */
    private int dId;
    private Department dept;
    /**
     * 无参构造器
     */
    public Employees() {
    }

    public Employees(int eId, String eName, String eSex, int eAge, String eTel, Date eBirthday, String eAddr) {
        this.eId = eId;
        this.eName = eName;
        this.eSex = eSex;
        this.eAge = eAge;
        this.eTel = eTel;
        this.eBirthday = eBirthday;
        this.eAddr = eAddr;
    }

    public Employees(int eId, String eName, String eSex, int eAge, String eTel, Date eBirthday, String eAddr, int dId, Department dept) {
        this.eId = eId;
        this.eName = eName;
        this.eSex = eSex;
        this.eAge = eAge;
        this.eTel = eTel;
        this.eBirthday = eBirthday;
        this.eAddr = eAddr;
        this.dId = dId;
        this.dept = dept;
    }

    /**
     * set get方法
     */
    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }



    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteSex() {
        return eSex;
    }

    public void seteSex(String eSex) {
        this.eSex = eSex;
    }

    public int geteAge() {
        return eAge;
    }

    public void seteAge(int eAge) {
        this.eAge = eAge;
    }

    public String geteTel() {
        return eTel;
    }

    public void seteTel(String eTel) {
        this.eTel = eTel;
    }

    public Date geteBirthday() {
        return eBirthday;
    }

    public void seteBirthday(Date eBirthday) {
        this.eBirthday = eBirthday;
    }

    public String geteAddr() {
        return eAddr;
    }

    public void seteAddr(String eAddr) {
        this.eAddr = eAddr;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }
}
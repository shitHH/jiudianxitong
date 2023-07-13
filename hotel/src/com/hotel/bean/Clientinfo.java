package com.hotel.bean;


import java.util.Date;
/**
 * @author lk
 *客户实体类
 **/
public class Clientinfo {
    /**
     * 用户序号
     */
    private int cId;
    /**
     * 客户名
     */
    private String name;
    /**
     *性别
     */
    private String sex;
    /**
     *电话
     */
    private String tel;
    /**
     *入住时间
     */
    private Date checkInTime;
    /**
     *退房时间
     */
    private Date checkOutTime;
    /**
     *身份证号
     */
    private String idNumber;
    /**
     *客户等级序号
     */
    private int level;
    private Clientlevel clientlevel;

    /**
     * 客户信息表无参构造
     */
    public Clientinfo() {
    }
    /**
     * 客户信息表全参构造
     */

    public Clientinfo(int cId, String name, String sex, String tel, Date checkInTime, Date checkOutTime, String idNumber, int level, Clientlevel clientlevel) {
        this.cId = cId;
        this.name = name;
        this.sex = sex;
        this.tel = tel;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.idNumber = idNumber;
        this.level = level;
        this.clientlevel = clientlevel;
    }

    public Clientlevel getClientlevel() {
        return clientlevel;
    }

    public void setClientlevel(Clientlevel clientlevel) {
        this.clientlevel = clientlevel;
    }



    /**
     *get set 方法
     */

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }


    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Date getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(Date checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Clientinfo{" +
                "cId=" + cId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", tel='" + tel + '\'' +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                ", idNumber='" + idNumber + '\'' +
                ", level=" + level +
                ", clientlevel=" + clientlevel +
                '}';
    }
}

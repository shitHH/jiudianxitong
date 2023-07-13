package com.hotel.bean;

import java.util.Date;

/**
 * @author xu
 * 预定表实体类
 */
public class Reserve {
    /**
     * 预订序号
     */
    private int yId;
    /**
     * 客房序号
     */
    private int gId;
    /**
     * 客户名
     */
    private String name;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 电话号
     */
    private String tel;
    /**
     * 预订开始时间
     */
    private Date arriveTime;
    /**
     * 预订来开时间
     */
    private Date leaveTime;

    /**
     * 无参构造器
     */
    public Reserve() {
    }

    /**
     * 全参构造器
     * @param yId
     * @param gId
     * @param name
     * @param idNumber
     * @param tel
     * @param arriveTime
     * @param leaveTime
     */
    public Reserve(int yId, int gId, String name, String idNumber, String tel, Date arriveTime, Date leaveTime) {
        this.yId = yId;
        this.gId = gId;
        this.name = name;
        this.idNumber = idNumber;
        this.tel = tel;
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
    }

    public int getyId() {
        return yId;
    }

    public void setyId(int yId) {
        this.yId = yId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
}

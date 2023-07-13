package com.hotel.bean;

import java.util.Date;

/**
 * @author gmx
 * 入住信息表
 */
public class CheckIn {
    /**
     * 入住编号
     */
    private int id;
    /**
     * 房间编号
     */
    private int gId;
    /**
     * 房间类型编号
     */
    private int rId;
    /**
     * 入住人姓名
     */
    private String name;
    /**
     * 入住人身份证号
     */
    private String idNumber;
    /**
     * 入住人手机号
     */
    private String tel;
    /**
     * 入住时间
     */
    private Date checkInTime;
    /**
     * 离宿时间
     */
    private Date checkOutTime;
    /**
     * 消费金额
     */
    private double expense;
    /**
     * 订单记录人
     */
    private int eId;
    /**
     * 修改时间
     */
    private Date modifyDate;
    /**
     * 修改人
     */
    private int modifyBy;
    /**
     * 房间类
     */
    private GuestRoom guestRoom;

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    public void setGuestRoom(GuestRoom guestRoom) {
        this.guestRoom = guestRoom;
    }

    /**
     * 无参构造器
     *
     */

    public CheckIn() {
    }
    /**
     * 全参构造器
     */
    public CheckIn(int id, int gId, int rId, String name, String idNumber, String tel, Date checkInTime, Date checkOutTime, double expense, int eId, Date modifyDate, int modifyBy, GuestRoom guestRoom) {
        this.id = id;
        this.gId = gId;
        this.rId = rId;
        this.name = name;
        this.idNumber = idNumber;
        this.tel = tel;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.expense = expense;
        this.eId = eId;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
        this.guestRoom = guestRoom;
    }

    /**
     * get set方法
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
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

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(int modifyBy) {
        this.modifyBy = modifyBy;
    }
}

package com.hotel.bean;

import java.util.Date;

/**
 * @author gmx
 * 离宿表
 */
public class CheckOut {
    /**
     * 编号
     */
    private int id;
    /**
     * 关联的入住id
     */
    private String name;
    /**
     * 消费金额
     */
    private double expense;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 操作人员
     */
    private int eId;
    /**
     * 房间编号
     */
    private int rId;
    /**
     * 房间类型编号
     */
    private int gId;
    /**
     * 电话
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
     * 身份证号
     */
    private String idNumber;
    private GuestRoom guestRoom;

    public CheckOut(int id, String name, double expense, Date createDate, int eId, int rId, int gId, String tel, Date checkInTime, Date checkOutTime, String idNumber, GuestRoom guestRoom) {
        this.id = id;
        this.name = name;
        this.expense = expense;
        this.createDate = createDate;
        this.eId = eId;
        this.rId = rId;
        this.gId = gId;
        this.tel = tel;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.idNumber = idNumber;
        this.guestRoom = guestRoom;
    }

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    public void setGuestRoom(GuestRoom guestRoom) {
        this.guestRoom = guestRoom;
    }

    /**
     * 无参构造器
     */
    public CheckOut() {
    }
    /**
     * 全参构造器
     */
    public CheckOut(int id, String name, double expense, Date createDate, int eId, int rId, int gId, String tel, Date checkInTime, Date checkOutTime, String idNumber) {
        this.id = id;
        this.name = name;
        this.expense = expense;
        this.createDate = createDate;
        this.eId = eId;
        this.rId = rId;
        this.gId = gId;
        this.tel = tel;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.idNumber = idNumber;
    }
    /**
     * set get 方法
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
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

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}

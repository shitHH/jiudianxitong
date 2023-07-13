package com.hotel.bean;

public class Count {
    /**
     *账单编号
     */
    private int coId;
    /**
     *房间支付金额
     */
    private double roomCount;
    /**
     *商品编号
     */
    private int pId;
    /**
     *消费总额
     */
    private double amount;
    /**
     *用户序号
     */
    private int cId;
    /**
     *账单表无参构造
     */
    public Count() {
    }
    /**
     *账单表全参构造
     */
    public Count(int coId, double roomCount, int pId, double amount, int cId) {
        this.coId = coId;
        this.roomCount = roomCount;
        this.pId = pId;
        this.amount = amount;
        this.cId = cId;
    }

    public int getCoId() {
        return coId;
    }

    /**
     *get set 方法
     */
    public void setCoId(int coId) {
        this.coId = coId;
    }

    public double getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(double roomCount) {
        this.roomCount = roomCount;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Count{" +
                "coId=" + coId +
                ", roomCount=" + roomCount +
                ", pId=" + pId +
                ", amount=" + amount +
                ", cId=" + cId +
                '}';
    }
}

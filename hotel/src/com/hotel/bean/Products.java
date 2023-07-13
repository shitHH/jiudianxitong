package com.hotel.bean;

/**
 * @author lk
 * 商品实体类
 */
public class Products {
    /**
     * 商品编号
     */
    private int pId;
    /**
     * 商品名称
     */
    private String pName;
    /**
     * 商品价格
     */
    private double price;
    /**
     * 商品类型编号
     */
    private int ptId;
    /**
     * 商品数量
     */
    private int pNum;
    /**
     * 无参构造器
     */
    public Products() {
    }
    /**
     * 有参构造器
     */
    public Products(int pId, String pName, double price, int ptId, int pNum) {
        this.pId = pId;
        this.pName = pName;
        this.price = price;
        this.ptId = ptId;
        this.pNum = pNum;
    }
    /**
     * set get方法
     */
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPtId() {
        return ptId;
    }

    public void setPtId(int ptId) {
        this.ptId = ptId;
    }

    public int getpNum() {
        return pNum;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }
}

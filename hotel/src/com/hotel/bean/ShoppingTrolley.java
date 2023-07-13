package com.hotel.bean;

/**
 * @author xu
 * 商品购物车信息实体类
 */
public class ShoppingTrolley {
    /**
     * 序号
     */
    private int sId;
    /**
     * 用户序号
     */
    private int uId;
    /**
     * 商品序号
     */
    private int pId;
    private Products products;

    public ShoppingTrolley() {
    }

    public ShoppingTrolley(int sId, int uId, int pId) {
        this.sId = sId;
        this.uId = uId;
        this.pId = pId;
    }

    public ShoppingTrolley(int uId, int pId) {
        this.uId = uId;
        this.pId = pId;
    }

    public ShoppingTrolley(int sId, int uId, int pId, Products products) {
        this.sId = sId;
        this.uId = uId;
        this.pId = pId;
        this.products = products;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}

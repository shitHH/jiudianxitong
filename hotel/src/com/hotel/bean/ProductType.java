package com.hotel.bean;

public class ProductType {
    private int ptId;
    private String pName;

    public ProductType() {
    }

    public ProductType(int ptId, String pName) {
        this.ptId = ptId;
        this.pName = pName;
    }

    public int getptId() {
        return ptId;
    }

    public void setptId(int ptId) {
        this.ptId = ptId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


}

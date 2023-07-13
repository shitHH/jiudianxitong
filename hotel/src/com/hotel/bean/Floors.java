package com.hotel.bean;
/**
 * @author gmx
 * 楼层实体类
 * xu  增加了tostring方法
 */

/**
 * 楼层表
 */
public class Floors {
    /**
     * 楼层编号
     */
    private int fId;
    /**
     * 楼层号
     */
    private String fName;
    /**
     * 无参构造器
     */
    public Floors() {
    }

    /**
     * 有参构造器
     * @param fId
     * @param fName
     */
    public Floors(int fId, String fName) {
        this.fId = fId;
        this.fName = fName;
    }
    /**
     * get set方法
     */
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
        return "序号" + fId +"  "+ fName  ;
    }
}

package com.hotel.bean;
/**
 * @author gmx
 * 预定房间实体类
 */
/**
 * 客房信息表
 */
public class GuestRoom {
    /**
     * 客房编号
     */
    private int gid;
    /**
     * 门牌号
     */
    private String houseNum;
    /**
     * 房间类型编号
     */
    private int rid;
    /**
     * 房间状态
     */
    private String state;
    /**
     * 房间类型
     */
    private Roomtype roomtype;
    /**
     * 无参构造器
     */
    public GuestRoom() {
    }
    /**
     * 有参构造器
     */
    public GuestRoom(int gid, String houseNum, int rid, String state) {
        this.gid = gid;
        this.houseNum = houseNum;
        this.rid = rid;
        this.state = state;
    }

    public GuestRoom(int gid, String houseNum, int rid, String state, Roomtype roomtype) {
        this.gid = gid;
        this.houseNum = houseNum;
        this.rid = rid;
        this.state = state;
        this.roomtype = roomtype;
    }

    public Roomtype getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Roomtype roomtype) {
        this.roomtype = roomtype;
    }

    /**
     * get set方法
     */
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(String houseNum) {
        this.houseNum = houseNum;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}

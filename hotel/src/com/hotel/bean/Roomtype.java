package com.hotel.bean;

/**
 * @author xu
 * 房间类型实体类
 */
public class Roomtype {
    /**
     * 房间类型序号
     */
    private int rId;
    /**
     * 房间面积
     */
    private String area;
    /**
     * 房间类型
     */
    private String rType;
    /**
     * 可住人数
     */
    private int liveNum;
    /**
     *楼层
     */
    private Floors floors;
    /**
     * 房间价格
     */
    private double price;
    /**
     * 图片
     */
    private String photo;
    /**
     * 房间床的数量
     */
    private int bedNum;
    /**
     * 房间数量
     */
    private int roomNum;
    /**
     * 已预订数
     */
    private int bookedNum;
    /**
     * 剩余数量
     */
    private int livedNum;
    /**
     * 楼层序号
     */
    private int fId;

    /**
     * 房态
     */
    private GuestRoom guestRoom;
    /**
     * 房间状态
     */
    private String state;
    /**
     * 无参构造
     */
    public Roomtype() {
    }

    public Roomtype(int rId, String area, String rType, int liveNum, Floors floors, double price, String photo, int bedNum, int roomNum, int bookedNum, int livedNum, int fId, GuestRoom guestRoom, String state) {
        this.rId = rId;
        this.area = area;
        this.rType = rType;
        this.liveNum = liveNum;
        this.floors = floors;
        this.price = price;
        this.photo = photo;
        this.bedNum = bedNum;
        this.roomNum = roomNum;
        this.bookedNum = bookedNum;
        this.livedNum = livedNum;
        this.fId = fId;
        this.guestRoom = guestRoom;
        this.state = state;
    }

    public Roomtype(int rId, String area, String rType, int liveNum, double price, String photo, int bedNum, int roomNum, int bookedNum, int livedNum, int fId) {
        this.rId = rId;
        this.area = area;
        this.rType = rType;
        this.liveNum = liveNum;
        this.price = price;
        this.photo = photo;
        this.bedNum = bedNum;
        this.roomNum = roomNum;
        this.bookedNum = bookedNum;
        this.livedNum = livedNum;
        this.fId = fId;
    }

    /**
     *
     * @param rId
     * @param area
     * @param rType
     * @param liveNum
     * @param floors
     * @param price
     * @param photo
     * @param bedNum
     * @param roomNum
     * @param bookedNum
     * @param livedNum
     */
    public Roomtype(int rId, String area, String rType, int liveNum, Floors floors, double price, String photo, int bedNum, int roomNum, int bookedNum, int livedNum) {
        this.rId = rId;
        this.area = area;
        this.rType = rType;
        this.liveNum = liveNum;
        this.floors = floors;
        this.price = price;
        this.photo = photo;
        this.bedNum = bedNum;
        this.roomNum = roomNum;
        this.bookedNum = bookedNum;
        this.livedNum = livedNum;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public int getrId() {
        return rId;
    }

    public void setrId(int rId) {
        this.rId = rId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    public int getLiveNum() {
        return liveNum;
    }

    public void setLiveNum(int liveNum) {
        this.liveNum = liveNum;
    }

    public Floors getFloors() {
        return floors;
    }

    public void setFloors(Floors floors) {
        this.floors = floors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getBedNum() {
        return bedNum;
    }

    public void setBedNum(int bedNum) {
        this.bedNum = bedNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getBookedNum() {
        return bookedNum;
    }

    public void setBookedNum(int bookedNum) {
        this.bookedNum = bookedNum;
    }

    public int getLivedNum() {
        return livedNum;
    }

    public void setLivedNum(int livedNum) {
        this.livedNum = livedNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public GuestRoom getGuestRoom() {
        return guestRoom;
    }

    public void setGuestRoom(GuestRoom guestRoom) {
        this.guestRoom = guestRoom;
    }

    @Override
    public String toString() {
        return "Roomtype{" +
                "rId=" + rId +
                ", area='" + area + '\'' +
                ", rType='" + rType + '\'' +
                ", liveNum=" + liveNum +
                ", floors=" + floors +
                ", price=" + price +
                ", photo='" + photo + '\'' +
                ", bedNum=" + bedNum +
                ", roomNum=" + roomNum +
                ", bookedNum=" + bookedNum +
                ", livedNum=" + livedNum +
                ", fId=" + fId +
                ", guestRoom=" + guestRoom +
                ", state='" + state + '\'' +
                '}';
    }
}

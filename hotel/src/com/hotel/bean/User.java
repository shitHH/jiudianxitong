package com.hotel.bean;

import java.util.Date;
import java.util.List;

/**
 * @author xu
 * 用户实体类
 */
public class User {
    /**
     * id
     */
    private int uId;
    /**
     * 用户姓名
     */
    private String uName;
    /**
     * 用户密码
     */
    private String uPassword;
    /**
     * 用户性别
     */
    private String uSex;
    /**
     * 用户身份证号
     */
    private String uIdNumber;
    /**
     * 用户电话
     */
    private String uTel;
    /**
     * 用户生日
     */
    private Date uBirthday;
    /**
     * 注册时间
     */
    private Date uInputdate;
    /**
     * 无参构造
     */
    public User() {
    }
    /**
     * 全参构造
     * @param uId
     * @param uName
     * @param uPassword
     * @param uSex
     * @param uIdNumber
     * @param uTel
     * @param uBirthday
     * @param uInputdate
     */

    public User(int uId, String uName, String uPassword, String uSex, String uIdNumber, String uTel, Date uBirthday, Date uInputdate) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
        this.uSex = uSex;
        this.uIdNumber = uIdNumber;
        this.uTel = uTel;
        this.uBirthday = uBirthday;
        this.uInputdate = uInputdate;
    }


    public User(String uName, String uPassword, String uSex, String uIdNumber, String uTel, Date uBirthday, Date uInputdate) {
        this.uName = uName;
        this.uPassword = uPassword;
        this.uSex = uSex;
        this.uIdNumber = uIdNumber;
        this.uTel = uTel;
        this.uBirthday = uBirthday;
        this.uInputdate = uInputdate;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) { this.uPassword = uPassword; }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public String getuIdNumber() {
        return uIdNumber;
    }

    public void setuIdNumber(String uIdNumber) {
        this.uIdNumber = uIdNumber;
    }

    public String getuTel() {
        return uTel;
    }

    public void setuTel(String uTel) {
        this.uTel = uTel;
    }

    public Date getuBirthday() {
        return uBirthday;
    }

    public void setuBirthday(Date uBirthday) {
        this.uBirthday = uBirthday;
    }

    public Date getuInputdate() {
        return uInputdate;
    }

    public void setuInputdate(Date uInputdate) {
        this.uInputdate = uInputdate;
    }
}

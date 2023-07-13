package com.hotel.dao;

import com.hotel.bean.CheckIn;

import java.util.List;

/**
 * @author gmx
 * 入住数据访问接口
 */
public interface ICheckInDao {
    /**
     * 查询所有入住信息
     */
    public List<CheckIn> selectAll();
    /**
     * 根据身份证号查询入住信息
     */
    public CheckIn findByIdNumber(String idNumber);
    /**
     * 添加入住信息
     */
    public int add(CheckIn checkIn);
    /**
     * 根据身份证号查询入住信息
     */
    public List<CheckIn> findListByIdNumber(String idNumber);
    public CheckIn selectId(int id);
    int delectId(int id);

}

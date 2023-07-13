package com.hotel.service;

import com.hotel.bean.CheckIn;

import java.util.List;

/**
 * @author 高梦新
 * 入住业务逻辑
 */
public interface ICheckInService {

    /**
     * 查询所有的入住信息
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
    public List<CheckIn> findListByIdNumber(String idNumber);
    public CheckIn selectId(int id);
    int delectId(int id);
}

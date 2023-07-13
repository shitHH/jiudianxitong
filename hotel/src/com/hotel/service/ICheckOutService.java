package com.hotel.service;



import com.hotel.bean.CheckOut;

import java.util.List;
/**
 * @author 高梦新
 * 退房业务逻辑
 */
public interface ICheckOutService {
    /**
     * 查询所有的入住信息
     */
    public List<CheckOut> selectAll();
    /**
     * 根据身份证号查询入住信息
     */
    public CheckOut findByIdNumber(String idNumber);
    public int add(CheckOut checkOut);
    /**
     * 查询所有退房信息信息
     */
    public List<CheckOut> selectTelAll(String tel);
}

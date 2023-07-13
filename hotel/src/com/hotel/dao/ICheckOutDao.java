
package com.hotel.dao;

import com.hotel.bean.CheckIn;
import com.hotel.bean.CheckOut;

import java.util.List;

/**
 * @author zyz
 * @create 2021-03-16 10:07
 * 退房数据访问接口
 **/
public interface ICheckOutDao {
    /**
     * 查询所有退房信息信息
     */
    public List<CheckOut> selectAll();
    /**
     * 查询所有退房信息信息
     */
    public List<CheckOut> selectTelAll(String tel);
    /**
     * 根据身份证号查询退房信息
     */
    public CheckOut findByIdNumber(String idNumber);
    public int add(CheckOut checkOut);

}

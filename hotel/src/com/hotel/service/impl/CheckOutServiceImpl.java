package com.hotel.service.impl;

import com.hotel.bean.CheckOut;
import com.hotel.dao.ICheckInDao;
import com.hotel.dao.ICheckOutDao;
import com.hotel.service.ICheckOutService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;
/**
 * @author 高梦新
 * 退房业务逻辑业务逻辑
 */
public class CheckOutServiceImpl implements ICheckOutService {
    //创建对象
    ICheckOutDao checkOutDao= SqlSessionUtil.getsession().getMapper(ICheckOutDao.class);
    @Override
    public List<CheckOut> selectAll() {

        return checkOutDao.selectAll();
    }

    @Override
    public CheckOut findByIdNumber(String idNumber) {

        return checkOutDao.findByIdNumber(idNumber);
    }

    @Override
    public int add(CheckOut checkOut) {
        return checkOutDao.add(checkOut);
    }

    @Override
    public List<CheckOut> selectTelAll(String tel) {
        return checkOutDao.selectTelAll(tel);
    }
}

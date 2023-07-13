package com.hotel.service.impl;

import com.hotel.bean.CheckIn;
import com.hotel.dao.ICheckInDao;
import com.hotel.service.ICheckInService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;
/**
 * @author 高梦新
 * 入住业务逻辑实现类
 */
public class CheckInServiceImpl implements ICheckInService {
    //创建对象
    ICheckInDao checkInDao=SqlSessionUtil.getsession().getMapper(ICheckInDao.class);
    @Override
    public List<CheckIn> selectAll() {
        return checkInDao.selectAll();
    }

    @Override
    public CheckIn findByIdNumber(String idNumber) {
        return checkInDao.findByIdNumber(idNumber);
    }

    @Override
    public int add(CheckIn checkIn) {
        return checkInDao.add(checkIn);
    }

    @Override
    public List<CheckIn> findListByIdNumber(String idNumber) {
        return checkInDao.findListByIdNumber(idNumber);
    }

    @Override
    public CheckIn selectId(int id) {
        return checkInDao.selectId(id);
    }

    @Override
    public int delectId(int id) {
        return checkInDao.delectId(id);
    }
}

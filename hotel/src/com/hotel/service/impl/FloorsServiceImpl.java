package com.hotel.service.impl;

import com.hotel.bean.Floors;
import com.hotel.dao.IFloorsDao;
import com.hotel.service.IFloorsService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class FloorsServiceImpl implements IFloorsService {
    IFloorsDao iFloorsDao= SqlSessionUtil.getsession().getMapper(IFloorsDao.class);
    @Override
    public List<Floors> findByfId(int fId) {
        return iFloorsDao.findByfId(fId);
    }
}

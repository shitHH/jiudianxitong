package com.hotel.service.impl;

import com.hotel.bean.Clientinfo;
import com.hotel.bean.Count;
import com.hotel.dao.ICountDao;
import com.hotel.service.IClientinfoService;
import com.hotel.service.ICountService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class CountServiceImpl implements ICountService {
    ICountDao iCountDao= SqlSessionUtil.getsession().getMapper(ICountDao.class);


    @Override
    public List<Count> findAll() {
        return iCountDao.findAll();
    }

    @Override
    public Count findBycoId(int coId) {
        return iCountDao.findBycoId(coId);
    }

    @Override
    public boolean save(Count count) {
         return iCountDao.save(count)>0?true:false;
    }

    @Override
    public boolean update(Count count) {
        return iCountDao.update(count)>0?true:false;
    }

    @Override
    public boolean delete(int coId) {
        return iCountDao.delete(coId)>0?true:false;
    }
}

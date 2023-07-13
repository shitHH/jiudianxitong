package com.hotel.service.impl;

import com.hotel.bean.Reserve;
import com.hotel.dao.IReserveDao;
import com.hotel.service.IReserveService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IReserveServiceImpl implements IReserveService {
    IReserveDao reserveDao= SqlSessionUtil.getsession().getMapper(IReserveDao.class);
    @Override
    public List<Reserve> selectAllRes() {
        return reserveDao.selectAllRes();
    }

    @Override
    public Reserve selectTel(String tel) {
        return reserveDao.selectTel(tel);
    }

    @Override
    public boolean delectRes(int yid) {
        return reserveDao.delectRes(yid)>0?true:false;
    }

    @Override
    public boolean addRes(Reserve reserve) {
        return reserveDao.addRes(reserve)>0?true:false;
    }

    @Override
    public boolean updateRes(Reserve reserve) {
        return reserveDao.updateRes(reserve)>0?true:false;
    }

    @Override
    public List<Reserve> selectPersonnelOrder(String tel) {
        return reserveDao.selectPersonnelOrder(tel);
    }

    @Override
    public Boolean delectGid(int gid) {
        int i=reserveDao.delectGid(gid);
        if (i>0){
            return true;
        }
        return false;
    }

    @Override
    public Reserve selectYId(int yid) {
        return reserveDao.selectYId(yid);
    }

    @Override
    public Reserve selectgId(int gid) {
        return reserveDao.selectgId(gid);
    }

}

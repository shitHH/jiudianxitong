package com.hotel.service.impl;

import com.hotel.bean.Clientinfo;
import com.hotel.dao.IClientinfoDao;
import com.hotel.service.IClientinfoService;
import com.hotel.util.DateUtil;
import com.hotel.util.SqlSessionUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 * @author lk
 *客户业务逻辑实现类
 **/
public class IClientinfoServiceImpl implements IClientinfoService {
    IClientinfoDao iClientinfoDao= SqlSessionUtil.getsession().getMapper(IClientinfoDao.class);

    @Override
    public List<Clientinfo> selectAll() {

        return iClientinfoDao.selectAll();
    }

    @Override
    public Clientinfo selectOne(int cId) {
        return iClientinfoDao.selectOne(cId);
    }

    @Override
    public boolean updateCin(Clientinfo cin) {
        return iClientinfoDao.updateCin(cin)>0?true:false;
    }

    @Override
    public boolean deleteCin(int cId) {
        return iClientinfoDao.deleteCin(cId)>0?true:false;
    }

    @Override
    public boolean addCin(Clientinfo cin) {

        return iClientinfoDao.addCin(cin)>0?true:false;
    }

    @Override
    public Clientinfo selectByname(String name) {
        return iClientinfoDao.selectByname(name);
    }

    @Override
    public Clientinfo selectByidNumber(String idNumber) {
        return iClientinfoDao.selectByidNumber(idNumber);
    }
}

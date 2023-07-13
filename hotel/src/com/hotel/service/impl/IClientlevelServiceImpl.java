package com.hotel.service.impl;

import com.hotel.bean.Clientlevel;
import com.hotel.dao.IClientlevelDao;
import com.hotel.service.IClientlevelService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IClientlevelServiceImpl implements IClientlevelService {
    IClientlevelDao iClientlevelDao = SqlSessionUtil.getsession().getMapper(IClientlevelDao.class);
    @Override
    public List<Clientlevel> selectAll() {
        return iClientlevelDao.selectAll();
    }

    @Override
    public Clientlevel selectOne(int level) {
        return iClientlevelDao.selectOne(level);
    }

    @Override
    public boolean addCle(Clientlevel cle) {
        return iClientlevelDao.addCle(cle)>0?true:false;
    }

    @Override
    public boolean updateCle(Clientlevel cle) {
        return iClientlevelDao.updateCle(cle)>0?true:false;
    }

    @Override
    public boolean deleteCin(int level) {
        return iClientlevelDao.deleteCin(level)>0?true:false;
    }
}

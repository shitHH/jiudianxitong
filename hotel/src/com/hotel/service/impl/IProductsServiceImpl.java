package com.hotel.service.impl;

import com.hotel.bean.Products;
import com.hotel.dao.IProductsDao;
import com.hotel.service.IProductsService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IProductsServiceImpl implements IProductsService {
    IProductsDao iProductsDao = SqlSessionUtil.getsession().getMapper(IProductsDao.class);
    @Override
    public List<Products> selectAll() {
        return iProductsDao.selectAll();
    }

    @Override
    public Products selectOne(int pId) {
        return iProductsDao.selectOne(pId);
    }

    @Override
    public Products selectTwo(String pName) {
        return iProductsDao.selectTwo(pName);
    }

    @Override
    public boolean addPro(Products pro) {
        return iProductsDao.addPro(pro)>0?true:false;
    }

    @Override
    public boolean updatePro(Products pro) {
        return iProductsDao.updatePro(pro)>0?true:false;
    }

    @Override
    public boolean deletePro(int pId) {
        return iProductsDao.deletePro(pId)>0?true:false;
    }
}

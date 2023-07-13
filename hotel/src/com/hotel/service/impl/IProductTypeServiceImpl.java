/**
 * @author zyz
 * @create 2021-03-11 15:10
 **/

package com.hotel.service.impl;

import com.hotel.bean.ProductType;
import com.hotel.dao.IProductTypeDao;
import com.hotel.service.IProductTypeService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IProductTypeServiceImpl implements IProductTypeService {
    IProductTypeDao productTypeDao = SqlSessionUtil.getsession().getMapper(IProductTypeDao.class);

    @Override
    public List<ProductType> selectAll() {
        return productTypeDao.selectAll();
    }

    @Override
    public ProductType selectOne(int ptId) {
        return productTypeDao.selectOne(ptId);
    }

    @Override
    public boolean add(ProductType product) {
        return productTypeDao.add(product) > 0 ? true : false;
    }

    @Override
    public boolean update(ProductType product) {
        return productTypeDao.update(product) > 0 ? true : false;
    }

    @Override
    public boolean delete(int id) {
        return productTypeDao.delete(id) > 0 ? true : false;
    }
}

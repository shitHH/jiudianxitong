package com.hotel.service.impl;

import com.hotel.bean.ShoppingTrolley;
import com.hotel.dao.IShoppingTrolleyDao;
import com.hotel.service.IShoppingTrolleyService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class IShoppingTrolleyServiceImpl implements IShoppingTrolleyService {
    IShoppingTrolleyDao shoppingTrolleyDao= SqlSessionUtil.getsession().getMapper(IShoppingTrolleyDao.class);
    @Override
    public List<ShoppingTrolley> allShoppingTrolley() {
        return shoppingTrolleyDao.allShoppingTrolley();
    }

    @Override
    public List<ShoppingTrolley> userShoppingTrolley(int uId) {
        return shoppingTrolleyDao.userShoppingTrolley(uId);
    }

    @Override
    public int addShoppingTrolley(ShoppingTrolley shoppingTrolley) {
        return shoppingTrolleyDao.addShoppingTrolley(shoppingTrolley);
    }

    @Override
    public Double findUserActionSUm(int getuId) {
        return shoppingTrolleyDao.findUserActionSUm(getuId);
    }

    @Override
    public int delectProducts(int sid) {
        return shoppingTrolleyDao.delectProducts(sid);
    }
}

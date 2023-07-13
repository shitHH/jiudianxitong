package com.hotel.service;

import com.hotel.bean.ShoppingTrolley;

import java.util.List;

public interface IShoppingTrolleyService {
    /**
     * 查询订购商品信息
     */
    public List<ShoppingTrolley> allShoppingTrolley();

    /**
     * 根据用户id查找用户购买的商品
     * @param uId
     * @return
     */
    public List<ShoppingTrolley> userShoppingTrolley(int uId);

    /**
     *
     * @return
     */
    public int addShoppingTrolley(ShoppingTrolley shoppingTrolley);

    /**
     * 根据用户id查询订单总金额
     * @param getuId
     * @return
     */
    Double findUserActionSUm(int getuId);
    /**
     * 通过序号删除用户的商品
     * @param sid
     * @return
     */
    int delectProducts(int sid);


}

package com.hotel.dao;

import com.hotel.bean.ShoppingTrolley;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IShoppingTrolleyDao {
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
     * 根据用户id查询用户的总购物金额
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

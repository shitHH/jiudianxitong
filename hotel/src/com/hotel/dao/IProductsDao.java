package com.hotel.dao;



import com.hotel.bean.Clientinfo;
import com.hotel.bean.Products;

import java.util.List;

/**
 * @author lk
 *商品数据访问接口
 **/
public interface IProductsDao {
    /**
     * 查询所有商品信息
     * @return
     */
    public List<Products> selectAll();
    /**
     * 根据商品id查询商品
     * @param pId
     * @return 商品对象
     */
    public Products selectOne(int pId);

    /**
     * 根据商品名称查询商品
     * @param pName
     * @return 商品对象
     */
    public Products selectTwo(String pName);
    /**
     * 添加商品
     * @param pro
     */
    public int addPro(Products pro);

    /**
     * 更新商品
     * @param pro
     */
    public int  updatePro(Products pro);

    /**
     * 删除商品
     * @param pId
     */
    public int deletePro(int pId);

}

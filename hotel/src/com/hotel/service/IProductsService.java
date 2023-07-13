package com.hotel.service;

import com.hotel.bean.Products;

import java.util.List;

public interface IProductsService {
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
    public boolean addPro(Products pro);

    /**
     * 更新商品
     * @param pro
     */
    public boolean  updatePro(Products pro);

    /**
     * 删除商品
     * @param pId
     */
    public boolean deletePro(int pId);
}

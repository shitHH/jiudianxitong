
package com.hotel.service;

import com.hotel.bean.ProductType;

import java.util.List;

/**
 * @author zyz
 * @create 2021-03-11 14:41
 * 商品种类业务逻辑接口
 **/
public interface IProductTypeService {
    /**
     *查询所有商品类型
     * @return
     */
    public List<ProductType> selectAll();

    /**
     * 根据商品类型编号查询商品类型
     * @param ptId
     * @return
     */
    public ProductType selectOne(int ptId);
    /**
     * 添加商品种类
     * @param product
     */
    public boolean add(ProductType product);

    /**
     * 更新商品种类
     * @param product
     */
    public boolean  update(ProductType product);

    /**
     * 删除商品种类
     * @param id
     */
    public boolean delete(int id);
}

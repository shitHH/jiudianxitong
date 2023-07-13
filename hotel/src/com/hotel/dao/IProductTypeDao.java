
package com.hotel.dao;



import com.hotel.bean.ProductType;

import java.util.List;

/**
 * @author zyz
 * @create 2021-03-10 14:37
 * 商品类型数据访问接口
 **/
public interface IProductTypeDao {

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
     * 返回受影响行数
     */
    public int add(ProductType product);

    /**
     * 根据商品种类编号更新商品种类
     * @param product
     * 返回受影响行数
     */
    public int  update(ProductType product);

    /**
     * 根据商品种类编号删除商品种类
     * @param id
     * 返回受影响行数
     */
    public int delete(int id);

    public List<ProductType> querylist(String name);
}

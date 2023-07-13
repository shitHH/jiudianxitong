package com.hotel.dao;

import com.hotel.bean.Count;

import java.util.List;

/**
 * 账单接口
 * @author sh
 */
public interface ICountDao {

    /**
     * 查询所有账单
     * @return 账单信息集合
     */
    public List<Count> findAll();

    /**
     * 通过账单编号获取账单信息
     * @return 账单对象
     */
    public Count findBycoId(int coId);

    /**
     * 增加账单信息
     * @param count
     * @return 1：成功
     */
    public int save(Count count);

    /**
     * 更新账单信息
     * @param count 账单信息对象
     * @return 1：成功
     */
    public int update(Count count);

    /**
     * 删除账单信息
     * @param coId 账单编号
     * @return 1：成功
     */
    public int delete(int coId);
}

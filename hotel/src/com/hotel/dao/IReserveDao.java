package com.hotel.dao;

import com.hotel.bean.Reserve;

import java.util.List;

public interface IReserveDao {
    /**
     * 查询所有的预订信息
     * @return
     */
    List<Reserve> selectAllRes();

    /**
     * 通过电话号查询订单信息
     * @param tel
     * @return
     */
    Reserve selectTel(String tel);
    Reserve selectYId(int yid);
    Reserve selectgId(int gid);
    /**
     * 通过电话号查询订单信息(一个用户多个订单)
     * @param tel
     * @return
     */
    List<Reserve> selectPersonnelOrder(String tel);

    /**
     * 通过编号删除订单
     * @param yid
     * @return
     */
    int delectRes(int yid);
    /**
     * 通过房间状态编号删除订单
     * @param gid
     * @return
     */
    int delectGid(int gid);

    /**
     * 添加订单
     * @param reserve
     * @return
     */
    int addRes(Reserve reserve);

    /**
     * 更新订单信息
     * @param reserve
     * @return
     */
    int updateRes(Reserve reserve);
}

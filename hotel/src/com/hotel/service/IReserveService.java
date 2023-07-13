package com.hotel.service;

import com.hotel.bean.Reserve;

import java.util.List;

public interface IReserveService {
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

    /**
     * 通过编号删除订单
     * @param yid
     * @return
     */
    boolean delectRes(int yid);

    /**
     * 添加订单
     * @param reserve
     * @return
     */
    boolean addRes(Reserve reserve);

    /**
     * 更新订单信息
     * @param reserve
     * @return
     */
    boolean updateRes(Reserve reserve);
    /**
     * 通过电话号查询订单信息(一个用户多个订单)
     * @param tel
     * @return
     */
    List<Reserve> selectPersonnelOrder(String tel);
    /**
     * 通过房间状态编号删除订单
     * @param gid
     * @return
     */
    Boolean delectGid(int gid);
    Reserve selectYId(int yid);
    Reserve selectgId(int gid);
}

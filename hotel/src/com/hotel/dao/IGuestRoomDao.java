package com.hotel.dao;

import com.hotel.bean.GuestRoom;

import java.util.List;

/**
 * 客房表接口
 * @author sh
 */
public interface IGuestRoomDao {

    /**
     * 查询所有客房信息
     * @return 客房集合
     */
    public List<GuestRoom> findAll();

    /**
     * 跟新客房表信息
     * @param guestRoom 客房表对象
     * @return 1：成功
     */
    public int update(GuestRoom guestRoom);

    /**
     * 通过客房序号删除客房信息
     * @param gId 客房序号
     * @return 1：成功
     */
    public int delete(int gId);

    /**
     * 增加客房信息
     * @param guestRoom 客房信息
     * @return 1：增加成功
     */
    public int save(GuestRoom guestRoom);

    /**
     * 增加客房信息
     * @param
     * @return
     */
    public GuestRoom findIdGuestRoom(int id);
    /**
     * 通过gId查询客户信息
     */
    public GuestRoom findByGId(int gId);

    /**
     * 展现所有房间和房间类型房态
     * @return
     */
    List<GuestRoom> allRoom();
}

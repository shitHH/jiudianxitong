package com.hotel.service;

import com.hotel.bean.GuestRoom;

import java.util.List;

public interface IGuestRoomService {

    /**
     * 查询所有客房信息
     * @return 客房集合
     */
    public List<GuestRoom> findAll();

    /**
     * 跟新客房表信息
     * @param guestRoom 客房表对象
     * @return
     */
    public boolean update(GuestRoom guestRoom);

    /**
     * 通过客房序号删除客房信息
     * @param gId 客房序号
     * @return
     */
    public boolean delete(int gId);

    /**
     * 增加客房信息
     * @param guestRoom 客房信息
     * @return
     */
    public boolean save(GuestRoom guestRoom);

    /**
     * 通过id查找房间对象
     * @param id
     * @return
     */
    public GuestRoom findIdGuestRoom(int id);
    /**
     * 通过gId查询
     */
    public GuestRoom findByGId(int gId);
    /**
     * 展现所有房间和房间类型房态
     * @return
     */
    List<GuestRoom> allRoom();
}

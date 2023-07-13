package com.hotel.service;

import com.hotel.bean.Roomtype;

import java.util.List;

/**
 * @author gmx
 * 房间类型的业务逻辑接口
 */
public interface IRoomtypeService {
    /**
     * @return 所有房间类型
     */
    List<Roomtype> selectAllRoomtype();

    /**
     * @return 所有房型及房间状态和房间编号
     */
    List<Roomtype> RoomtypeGuestRoom();

    /**
     * 通过房间类型查看详细信息
     * @param type
     * @return 房间类型
     */
    Roomtype findType(String type);

    /**
     * 通过id查看房间详细信息
     * @param id
     * @return房间类型
     */
    Roomtype findId(int id);

    /**
     * 增加房型
     * @param roomtype
     * @return
     */
    boolean addType(Roomtype roomtype);

    /**
     * 通过id删除房型
     * @param id
     * @return
     */
    boolean delectId(int id);

    /**
     * 通过房间类型删除房型
     * @param type
     * @return
     */
    boolean deleteType(String type);

    /**
     * 修改房型
     * @param roomtype
     * @return
     */
    boolean updateType(Roomtype roomtype);

    /**
     * 查询所有信息，包括房间状态
     * @return 房间所有信息集合
     */
    List<Roomtype> findAllState();

    /**
     * @param id
     * @return
     */
    Roomtype findIdRoomTypeGuestRoom(int id);
}

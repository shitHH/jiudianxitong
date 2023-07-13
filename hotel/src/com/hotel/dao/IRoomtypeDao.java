package com.hotel.dao;

import com.hotel.bean.Roomtype;

import java.util.List;

/**
 * @author xu
 * 房间类型访问接口
 */
public interface IRoomtypeDao {
    /**
     * @return 所有房间类型
     */
    List<Roomtype> selectAllRoomtype();

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
    int addType(Roomtype roomtype);

    /**
     * 通过id删除房型
     * @param id
     * @return
     */
    int delectId(int id);

    /**
     * 通过房间类型删除房型
     * @param type
     * @return
     */
    int deleteType(String type);

    /**
     * 修改房型
     * @param roomtype
     * @return
     */
    int updateType(Roomtype roomtype);

    /**
     * 查询所有信息，包括房间状态
     * @return 房间所有信息集合
     */
    List<Roomtype> findAllState();

    /**
     * @return 展示所有房间类型以及房态  联查
     */
    List<Roomtype> roomTypeGuestRoom();

    /**
     * @return 通过房间编号查找房间类型和和状态
     */
    Roomtype findIdRoomTypeGuestRoom(int id);
    /**
     * 增加房型
     * @param roomtype
     * @return
     */
    int addType2(Roomtype roomtype);
}

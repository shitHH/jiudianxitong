package com.hotel.service.impl;

import com.hotel.bean.Roomtype;
import com.hotel.dao.IReserveDao;
import com.hotel.dao.IRoomtypeDao;
import com.hotel.service.IRoomtypeService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

/**
 * @author gmx
 * 房间类型业务逻辑的实现类
 */
public class RoottypeServiceImpl implements IRoomtypeService {
    IRoomtypeDao roomtypeDao= SqlSessionUtil.getsession().getMapper(IRoomtypeDao.class);
    @Override
    public List<Roomtype> selectAllRoomtype() {
        return roomtypeDao.selectAllRoomtype();
    }

    @Override
    public List<Roomtype> RoomtypeGuestRoom() {
        return roomtypeDao.roomTypeGuestRoom();
    }

    @Override
    public Roomtype findType(String type) {
        return roomtypeDao.findType(type);
    }

    @Override
    public Roomtype findId(int id) {
        return roomtypeDao.findId(id);
    }

    @Override
    public boolean addType(Roomtype roomtype) {
        return roomtypeDao.addType(roomtype)>0?true:false;
    }

    @Override
    public boolean delectId(int id) {
        return roomtypeDao.delectId(id)>0?true:false;
    }

    @Override
    public boolean deleteType(String type) {
        return roomtypeDao.deleteType(type)>0?true:false;
    }

    @Override
    public boolean updateType(Roomtype roomtype) {
        return roomtypeDao.updateType(roomtype)>0?true:false;
    }

    @Override
    public List<Roomtype> findAllState() {
        return roomtypeDao.findAllState();
    }

    @Override
    public Roomtype findIdRoomTypeGuestRoom(int id) {
        return roomtypeDao.findIdRoomTypeGuestRoom(id);
    }


}

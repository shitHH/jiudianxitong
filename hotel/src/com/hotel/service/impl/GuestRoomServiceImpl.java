package com.hotel.service.impl;

import com.hotel.bean.GuestRoom;
import com.hotel.dao.IGuestRoomDao;
import com.hotel.service.IGuestRoomService;
import com.hotel.util.SqlSessionUtil;

import java.util.List;

public class GuestRoomServiceImpl implements IGuestRoomService {
    IGuestRoomDao iGuestRoomDao= SqlSessionUtil.getsession().getMapper(IGuestRoomDao.class);
    @Override
    public List<GuestRoom> findAll() {
        return iGuestRoomDao.findAll();
    }

    @Override
    public boolean update(GuestRoom guestRoom) {
        return iGuestRoomDao.update(guestRoom)>0?true:false;
    }

    @Override
    public boolean delete(int gId) {
        return iGuestRoomDao.delete(gId)>0?true:false;
    }

    @Override
    public boolean save(GuestRoom guestRoom) {
        return iGuestRoomDao.save(guestRoom)>0?true:false;
    }

    @Override
    public GuestRoom findIdGuestRoom(int id) {
        return iGuestRoomDao.findIdGuestRoom(id);
    }

    @Override
    public GuestRoom findByGId(int gId) {
        return iGuestRoomDao.findByGId(gId);
    }

    @Override
    public List<GuestRoom> allRoom() {
        return iGuestRoomDao.allRoom();
    }

}

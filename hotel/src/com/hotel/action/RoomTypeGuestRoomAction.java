package com.hotel.action;

import com.hotel.bean.GuestRoom;
import com.hotel.bean.Roomtype;
import com.hotel.service.IGuestRoomService;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.GuestRoomServiceImpl;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author xu
 * 房间类型和状态展示集合
 */
@WebServlet("/roomTypeGuestRoom.action")
public class RoomTypeGuestRoomAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IGuestRoomService guestRoomService=new GuestRoomServiceImpl();
        /*IRoomtypeService roomtypeService=new RoottypeServiceImpl();*/
        /*List<Roomtype> roomtypes= roomtypeService.RoomtypeGuestRoom();*/
        List<GuestRoom> guestRooms=guestRoomService.allRoom();
        if (guestRooms!=null){
            //创建session
            HttpSession session=req.getSession();
            session.setAttribute("guestRooms",guestRooms);
            req.getRequestDispatcher("roomTypeGuestRoom.jsp").forward(req,resp);
        }else {
            req.setAttribute("message","系统出错了");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

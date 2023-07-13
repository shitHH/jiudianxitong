package com.hotel.action;

import com.hotel.bean.GuestRoom;
import com.hotel.bean.Reserve;
import com.hotel.bean.Roomtype;
import com.hotel.bean.User;
import com.hotel.service.IReserveService;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.GuestRoomServiceImpl;
import com.hotel.service.impl.IReserveServiceImpl;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * @author xu
 * 在线预订并修改订单信息控制器
 */
@WebServlet("/onlineReserve.action")
public class OnlineReserveAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //获得业务逻辑对象
        GuestRoomServiceImpl guestRoomService=new GuestRoomServiceImpl();
        //获得传来的id值
        String gId=req.getParameter("id");
        if (gId!=null) {
            int id = Integer.valueOf(gId);
            System.out.println(id);
            GuestRoom guestRoom = guestRoomService.findIdGuestRoom(id);
            if (guestRoom!=null){
                String state=guestRoom.getState();
                System.out.println(state);
                if (state.equals("未预订")){
                    guestRoom.setState("已预订");
                    System.out.println(guestRoom.getState());
                    boolean flag=guestRoomService.update(guestRoom);
                    System.out.println(flag);
                    if (flag){
                        //得到session对象
                        HttpSession session=req.getSession();
                        //得到当前用户信息
                        User user=(User)session.getAttribute("user1");
                        System.out.println(user.getuName());
                        //创建订单对象
                        Reserve reserve=new Reserve();
                        reserve.setgId(guestRoom.getGid());
                        reserve.setName(user.getuName());
                        reserve.setIdNumber(user.getuIdNumber());
                        reserve.setTel(user.getuTel());
                        reserve.setArriveTime(new Date());
                        IReserveService reserveService=new IReserveServiceImpl();
                        boolean flag2=reserveService.addRes(reserve);
                        if (flag2){
                            req.getRequestDispatcher("roomTypeGuestRoom.action").forward(req,resp);
                        }else {
                            System.out.println("更改预定表时出错了");
                            req.getRequestDispatcher("roomTypeGuestRoom.action").forward(req,resp);
                        }
                    }else {
                        System.out.println("更改预订状态是出错了");
                        req.getRequestDispatcher("roomTypeGuestRoom.action").forward(req,resp);
                    }
                }else {
                    System.out.println("匹配未预订时出错了");
                    req.getRequestDispatcher("roomTypeGuestRoom.action").forward(req,resp);
                }
            }else {
                System.out.println("没有的到guestroom对象");
                req.getRequestDispatcher("roomTypeGuestRoom.action").forward(req,resp);
            }
        }else {
            req.setAttribute("message","没有得到rid");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

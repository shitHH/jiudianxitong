package com.hotel.action;

import com.hotel.bean.GuestRoom;
import com.hotel.bean.Reserve;
import com.hotel.bean.User;
import com.hotel.service.IGuestRoomService;
import com.hotel.service.IReserveService;
import com.hotel.service.impl.GuestRoomServiceImpl;
import com.hotel.service.impl.IReserveServiceImpl;

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
 * 取消订单控制器
 */
@WebServlet("/cancelOrder.action")
public class CancelOrderAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //创建业务逻辑对象
        IReserveService reserveService=new IReserveServiceImpl();
        IGuestRoomService guestRoomService=new GuestRoomServiceImpl();
        //获得gid值
        String id=req.getParameter("id");
        System.out.println(id);
        int gid=Integer.valueOf(id);
        Boolean flag=reserveService.delectGid(gid);
        if (flag){
            GuestRoom guestRoom = guestRoomService.findIdGuestRoom(gid);
            guestRoom.setState("未预订");
            boolean flag2=guestRoomService.update(guestRoom);
            System.out.println(flag2);
            if (flag2){
                req.getRequestDispatcher("PersonnelOrder.action").forward(req,resp);
            }else {
                System.out.println("更改状态时出错了");
                resp.sendRedirect("error.jsp");
            }
        }else {
            System.out.println("删除订单时出错哦了");
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

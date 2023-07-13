package com.hotel.action;

import com.hotel.bean.GuestRoom;
import com.hotel.bean.Reserve;
import com.hotel.service.IGuestRoomService;
import com.hotel.service.IReserveService;
import com.hotel.service.impl.GuestRoomServiceImpl;
import com.hotel.service.impl.IReserveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author gmx
 * 修改预订单控制器
 */
@WebServlet("/reserveedit.action")
public class ReserveEditAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IReserveService reserveService=new IReserveServiceImpl();
        IGuestRoomService guestRoomService=new GuestRoomServiceImpl();
      String gid1=req.getParameter("gid");
      int gId11=Integer.valueOf(gid1);
        String gid2=req.getParameter("gid2");
        int gId22=Integer.valueOf(gid2);

        req.getRequestDispatcher("reserve.action").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

package com.hotel.action;

import com.hotel.bean.Roomtype;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.RoottypeServiceImpl;
import com.mysql.cj.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * 房间类型列表控制器
 * @author sh
 */
@WebServlet("/roomtypemanage.action")
public class RoomTypeManageAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoomtypeService roomtypeService=new RoottypeServiceImpl();
        List<Roomtype> list= roomtypeService.selectAllRoomtype();
        System.out.println(list);
        //创建session对象
        HttpSession session=req.getSession();
        //将用户列表放入session中
        session.setAttribute("list",list);
        //转发
        req.getRequestDispatcher("RoomTypeManage.jsp").forward(req,resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

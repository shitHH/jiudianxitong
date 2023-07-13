package com.hotel.action;

import com.hotel.bean.CheckIn;
import com.hotel.service.ICheckInService;
import com.hotel.service.impl.CheckInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author 高梦新
 * 入住控制器
 */
@WebServlet("/checkIn.action")
public class CheckInAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ICheckInService checkInService=new CheckInServiceImpl();
        //创建列表接收对象
        List<CheckIn> list= checkInService.selectAll();
        //创建session对象
        HttpSession session= req.getSession();
        //将列表传输到session集合中
        req.setAttribute("list",list);
        //页面重定向
        req.getRequestDispatcher("checkin.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

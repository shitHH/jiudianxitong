package com.hotel.action;

import com.hotel.bean.CheckIn;
import com.hotel.bean.CheckOut;
import com.hotel.service.ICheckInService;
import com.hotel.service.ICheckOutService;
import com.hotel.service.impl.CheckInServiceImpl;
import com.hotel.service.impl.CheckOutServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/checkout.action")
public class CheckOutAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        ICheckOutService checkOutService=new CheckOutServiceImpl();
        //创建列表接收对象
        List<CheckOut> list= checkOutService.selectAll();
        //创建session对象
        HttpSession session= req.getSession();
        //将列表传输到session集合中
        session.setAttribute("list",list);
        //页面重定向
        System.out.println(list);
        req.getRequestDispatcher("checkout.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

package com.hotel.action;

import com.hotel.bean.Reserve;
import com.hotel.service.IReserveService;
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
 * @author gmx
 * 订单信息控制器
 */
@WebServlet("/reserve.action")
public class ReserveAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IReserveService reserveService=new IReserveServiceImpl();
        //列出所有信息
        List<Reserve> list=reserveService.selectAllRes();
        //创建session对象
        HttpSession session= req.getSession();
        //将列表传输到session集合中
        session.setAttribute("list",list);

        //页面重定向
        req.getRequestDispatcher("reserve.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

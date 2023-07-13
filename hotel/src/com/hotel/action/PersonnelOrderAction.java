package com.hotel.action;

import com.hotel.bean.Reserve;
import com.hotel.bean.User;
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
 * @author xu
 * 个人订单
 */
@WebServlet("/PersonnelOrder.action")
public class PersonnelOrderAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IReserveService reserveService=new IReserveServiceImpl();
        //创建session对象
        HttpSession session= req.getSession();
        //得到当前用户
        User user=(User)session.getAttribute("user1");
        //得到用户的电话
        String tel=user.getuTel();
        //得到用户的所有订单
        List<Reserve> reserves=reserveService.selectPersonnelOrder(tel);
        if (reserves!=null){
            //将用户的订单信息通过订单传到会话
            session.setAttribute("reserves",reserves);
            req.getRequestDispatcher("PersonnelOrder.jsp").forward(req,resp);
        }else {
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

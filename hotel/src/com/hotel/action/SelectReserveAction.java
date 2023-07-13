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
 * 查询某一个订单信息
 */
@WebServlet("/selectreserve.action")
public class SelectReserveAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IReserveService reserveService=new IReserveServiceImpl();
        String tel=req.getParameter("tel");
        //得到用户的所有订单
        List<Reserve> reserves=reserveService.selectPersonnelOrder(tel);
        if (reserves!=null){
            //将用户的订单信息通过订单传到会话
            req.setAttribute("reserve2",reserves);
            req.getRequestDispatcher("selectReserve.jsp").forward(req,resp);
        }else {
            resp.sendRedirect("selectReserve.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

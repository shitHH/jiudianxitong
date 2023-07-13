package com.hotel.action;

import com.hotel.bean.CheckIn;
import com.hotel.bean.CheckOut;
import com.hotel.service.ICheckOutService;
import com.hotel.service.impl.CheckOutServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/**
 * @author lk
 * 通过身份证号查询退房信息控制器
 */
@WebServlet("/selectcheckout.action")
public class SelectCheckOutAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICheckOutService checkOutService=new CheckOutServiceImpl();
        String idNumber=req.getParameter("idNumber");
        CheckOut checkOut = checkOutService.findByIdNumber(idNumber);
        HttpSession session= req.getSession();
        session.setAttribute("checkOut",checkOut);
        //页面重定向
        resp.sendRedirect("selectCheckOut.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

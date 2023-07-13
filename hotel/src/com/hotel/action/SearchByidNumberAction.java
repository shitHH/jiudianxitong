package com.hotel.action;

import com.hotel.bean.Clientinfo;
import com.hotel.service.IClientinfoService;
import com.hotel.service.impl.IClientinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author lk
 * 通过身份证号查找客户信息控制器
 */
@WebServlet("/sid.action")
public class SearchByidNumberAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        String idNumber = req.getParameter("idNumber");
        Clientinfo clientinfo = clientinfoService.selectByidNumber(idNumber);
        HttpSession session = req.getSession();
        session.setAttribute("clientinfo",clientinfo);
        req.getRequestDispatcher("searchClientinfo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

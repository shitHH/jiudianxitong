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
 * 通过编号查找客户信息控制器
 */
@WebServlet("/scin.action")
public class SearchClientinfoAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        String cId =req.getParameter("cId");
        Clientinfo clientinfo = clientinfoService.selectOne(Integer.valueOf(cId));
        HttpSession session =req.getSession();
        session.setAttribute("clientinfo",clientinfo);
        req.getRequestDispatcher("searchClientinfo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

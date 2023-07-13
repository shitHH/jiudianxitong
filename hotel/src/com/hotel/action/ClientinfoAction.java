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
import java.util.List;

/**
 * @author lk
 * 客户信息控制器
 */
@WebServlet("/clientinfo.action")
public class ClientinfoAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建对象
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        List<Clientinfo> list= clientinfoService.selectAll();
        System.out.println(list);
        //创建session对象
        HttpSession session =req.getSession();
        //将对象放入session中
        session.setAttribute("list",list);
        //转发到客户列表页面
        req.getRequestDispatcher("clientinfo.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

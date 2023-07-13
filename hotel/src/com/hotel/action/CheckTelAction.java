package com.hotel.action;

import com.hotel.service.IUserService;
import com.hotel.service.impl.IUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xu
 * 注册时检查电话号的控制器
 */
@WebServlet("/checkTel.action")
public class CheckTelAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //创建业务逻辑对象
        IUserService userService=new IUserServiceImpl();
        String tel=req.getParameter("tel");
        Boolean flag=userService.findTel(tel);
        System.out.println(flag);
        if (flag){
            resp.getWriter().print("ok");
        }else {
            resp.getWriter().print("此电话已经注册过了");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

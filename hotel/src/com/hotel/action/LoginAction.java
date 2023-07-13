package com.hotel.action;


import com.hotel.bean.User;
import com.hotel.service.IUserService;
import com.hotel.service.impl.IUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author xu
 * 登录页面控制器
 */
@WebServlet("/login.action")
public class   LoginAction  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IUserService userService=new IUserServiceImpl();
        System.out.println(userService);
        //接收登录信息
        String tel=req.getParameter("tel");
        String pass=req.getParameter("pass");
        System.out.println(tel+"    "+pass);
        //创建对象
        User user=userService.selectUser(tel,pass);
        System.out.println(user);
        if (user!=null){
            if (user.getuId()==1){
                System.out.println(user.getuId());
                //管理员登录
                HttpSession session=req.getSession();
                session.setAttribute("user",user);
                resp.sendRedirect("admin.jsp");

            }else if(user.getuId()==2){
                //前台登录
                HttpSession session=req.getSession();
                session.setAttribute("user",user);
                resp.sendRedirect("reception.jsp");
            }else {
                //用户登录
                HttpSession session=req.getSession();
                session.setAttribute("user1",user);
                resp.sendRedirect("client.jsp");
            }
        }else {
            //账号和密码错误 重新回到登录界面并提示错误
            req.setAttribute("message","用户名或密码错误");//将message存到req中，仅限当前页面
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

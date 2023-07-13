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
 * 修改密码控制器
 */
@WebServlet("/changePass2.action")
public class ChangePassAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("1");
        //创建接口对象
        IUserService userService=new IUserServiceImpl();
        //创建session对象
        HttpSession session= req.getSession();
        User user=(User) session.getAttribute("user1");
        String idNum=user.getuIdNumber();
        String pass=req.getParameter("pass");
        Boolean flag=userService.updatePass(pass,idNum);
        System.out.println(flag);
        if (flag){
            session.invalidate();
            req.getRequestDispatcher("login.jsp").forward(req,resp);
          /*  resp.sendRedirect("login.jsp");*/
        }else {
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

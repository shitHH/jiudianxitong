package com.hotel.action;

import com.hotel.bean.User;
import com.hotel.service.IUserService;
import com.hotel.service.impl.IUserServiceImpl;
import com.hotel.util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;


/**
 * @author xu
 * 注册控制器
 */
@WebServlet("/regist.action")
public class RegistAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IUserService userService= new  IUserServiceImpl();
        //获取字符
        String name=req.getParameter("name");
        String tel=req.getParameter("tel");
        String pass=req.getParameter("pass");
        String sex=req.getParameter("sex");
        String idNumber=req.getParameter("idNumber");
        String year=req.getParameter("year");
        String month =req.getParameter("month");
        String day =req.getParameter("day");
        Date birthday= DateUtil.getDate(year,month,day);
        User user=new User(name,pass,sex,idNumber,tel,birthday,new Date());
        System.out.println(name+"   "+tel+"   "+pass+"   "+sex+"   "+idNumber+"   "+year+"   "+month+"   "+day+birthday);
        Boolean flag=userService.add(user);
        if (flag){
            resp.sendRedirect("login.jsp");
        }else {
            req.setAttribute("message","错误");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

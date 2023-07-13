package com.hotel.action;

import com.hotel.bean.User;
import com.hotel.dao.IUserDao;
import com.hotel.service.IUserService;
import com.hotel.service.impl.IUserServiceImpl;
import com.hotel.util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

/**
 * @author xu
 * 检查是否可以修改密码控制器
 */
@WebServlet("/changePass.action")
public class CheckChangePassAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(2);
        //创建业务逻辑对象
        IUserService userService=new IUserServiceImpl();
        String idNum=req.getParameter("idNum");
        String name=req.getParameter("name");
        String tel=req.getParameter("tel");
        String year=req.getParameter("year");
        String month =req.getParameter("month");
        String day =req.getParameter("day");
        Date birthday= DateUtil.getDate(year,month,day);
        String bri2=birthday.toString().substring(0,11);
        //通过身份证号查找是否有此用户
        User user=userService.findUser(idNum);
        if (user!=null){
            String bri=user.getuBirthday().toString().substring(0,11);
            if (!user.getuName().equals(name)){
                resp.getWriter().print("你的姓名不匹配");
            }else if(!user.getuTel().equals(tel)){
                resp.getWriter().print("你的电话不匹配");
            }else if (!bri.equals(bri2)){
                resp.getWriter().print("你的生日不匹配");
            }
        }else {
            resp.getWriter().print("您的身份证输入有误，此身份证号尚未注册或不合法");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

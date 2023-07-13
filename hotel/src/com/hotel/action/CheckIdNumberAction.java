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
 * 注册检查身份证的控制器
 */
@WebServlet("/checkIdNumber.action")
public class CheckIdNumberAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        System.out.println("ddd");
        IUserService userService=new IUserServiceImpl();
        String idNumber=req.getParameter("idNumber");
        boolean flag=userService.findIdNum(idNumber);
        System.out.println(flag);
        if (flag){
            resp.getWriter().print("ok");
        }else {
            resp.getWriter().print("此身份证号已经注册过了");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

package com.hotel.action;

import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deleteroomtype.action")
public class DeleteRoomTypeAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象

        IRoomtypeService roomtypeService=new RoottypeServiceImpl();
        String idStr=req.getParameter("id");//参数和返回值都是String
        System.out.println(idStr);
        if(idStr!=null){
            int id=Integer.valueOf(idStr);//将String的id转换成int类型
            boolean flag= roomtypeService.delectId(id);
            if(flag){
                //成功，转到房间类型action
                resp.sendRedirect("roomtypemanage.action");
            }else{
                //转发到错误页面
                req.setAttribute("message","人员删除失败");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
        }else{
            //转发到错误页面
            req.setAttribute("message","人员id不能为空");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

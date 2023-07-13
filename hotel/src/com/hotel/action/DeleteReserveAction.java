package com.hotel.action;

import com.hotel.service.IReserveService;
import com.hotel.service.impl.IReserveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author gmx
 * 删除订单的操作
 */
@WebServlet("/deletereserve.action")
public class DeleteReserveAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(1);
        //创建预订业务逻辑对象
        IReserveService reserveService=new IReserveServiceImpl();
        //接收用户的预定信息的编号
        String yidStr=req.getParameter("yId");
        //输出用户的订单编号
        System.out.println(yidStr);
        //判断订单编号是否为空
        if(yidStr!=null){
            //将接收到的订单序号的信息转换为int类型
            int yid=Integer.valueOf(yidStr);
            //调用删除预定信息的方法
            boolean flag= reserveService.delectRes(yid);
            //判断是否删除成功
            if(flag){
                //如果删除成功就跳转到reserve.action
                resp.sendRedirect("reserve.action");
            }else{
                //如果删除失败，则跳转到错误界面、
                resp.sendRedirect("error.jsp");
            }
        }else{
            //如果没有获取到用户的参数信息，跳转到失败界面
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);//事件委托
    }
}

package com.hotel.action;

import com.hotel.bean.Count;
import com.hotel.bean.Roomtype;
import com.hotel.service.ICountService;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.CountServiceImpl;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updatecount.action")
public class UpdateCountAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICountService countService=new CountServiceImpl();
        String coId=req.getParameter("coId");
        String roomCount=req.getParameter("roomCount");
        String pId=req.getParameter("pId");
        String amount=req.getParameter("amount");
        String cId=req.getParameter("cId");
        System.out.println("roomCount:"+roomCount);
        System.out.println("pId:"+pId);
        System.out.println("amount:"+amount);
        System.out.println("cId:"+cId);
        System.out.println("roomCount:"+roomCount);
        Count count=new Count();
        if (coId!=""){
            System.out.println(1);
        count.setCoId(Integer.valueOf(coId));} else {count.setCoId(0);}
        if(roomCount!=""){
        count.setRoomCount(Double.parseDouble(roomCount));}else {count.setRoomCount(0);}
        if(pId!=""){
        count.setpId(Integer.valueOf(pId));}else {count.setpId(0);}
        if (amount!=""){
        count.setAmount(Double.parseDouble(amount));}else {count.setAmount(0);}
        if (cId!=""){
        count.setcId(Integer.valueOf(cId));}else {count.setcId(0);}


        boolean flag= countService.update(count);
        if(flag){
            req.getRequestDispatcher("countmanage.action").forward(req,resp);
        }else{
            //转发到错误页面
            req.setAttribute("message","添加失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }





    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

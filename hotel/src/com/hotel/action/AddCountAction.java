package com.hotel.action;

import com.hotel.bean.Count;
import com.hotel.bean.Roomtype;
import com.hotel.service.ICountService;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.CountServiceImpl;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addcount.action")
public class AddCountAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICountService countService=new CountServiceImpl();
        String roomCount=req.getParameter("roomCount");
        String pId=req.getParameter("pId");
        String amount=req.getParameter("amount");
        String cId=req.getParameter("cId");

        Count count=new Count();
        count.setRoomCount(Integer.valueOf(roomCount));
        count.setpId(Integer.valueOf(pId));
        count.setAmount(Integer.valueOf(amount));
        count.setcId(Integer.valueOf(cId));


        boolean flag= countService.save(count);
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

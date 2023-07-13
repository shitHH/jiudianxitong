package com.hotel.action;

import com.hotel.bean.Roomtype;
import com.hotel.service.IRoomtypeService;
import com.hotel.service.impl.RoottypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addroomtype.action")
public class AddRoomTypeAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoomtypeService roomtypeService=new RoottypeServiceImpl();
        String rType=req.getParameter("rType");
        String area=req.getParameter("area");
        String liveNum=req.getParameter("liveNum");
        String price=req.getParameter("price");
        String bedNum=req.getParameter("bedNum");
        String roomNum=req.getParameter("roomNum");
        String fId=req.getParameter("fId");
        Roomtype roomtype=new Roomtype();
        roomtype.setrType(rType);
        roomtype.setArea(area);
        roomtype.setLiveNum(Integer.valueOf(liveNum));
        roomtype.setPrice(Double.parseDouble(price));
        roomtype.setBedNum(Integer.valueOf(bedNum));
        roomtype.setRoomNum(Integer.valueOf(roomNum));
        roomtype.setfId(Integer.valueOf(fId));

        boolean flag= roomtypeService.addType(roomtype);
        if(flag){
            req.getRequestDispatcher("roomtypemanage.action").forward(req,resp);
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

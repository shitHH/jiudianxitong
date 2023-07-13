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

@WebServlet("/updateroomtype.action")
public class UpdateRoomTypeAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IRoomtypeService roomtypeService=new RoottypeServiceImpl();
        String rId=req.getParameter("rId");
        System.out.println(rId);
        String rType=req.getParameter("rType");
        String area=req.getParameter("area");
        String liveNum=req.getParameter("liveNum");
        String price=req.getParameter("price");
        String bedNum=req.getParameter("bedNum");
        String roomNum=req.getParameter("roomNum");
        String fId=req.getParameter("fId");
        System.out.println(rType+area+liveNum+price+bedNum+roomNum+fId);

        Roomtype roomtype=new Roomtype();
        if (rId!=""){
        roomtype.setrId(Integer.valueOf(rId));
        }else{roomtype.setrId(0);}
        System.out.println(Integer.valueOf(rId));
        if (rType!=""){
            roomtype.setrType(rType);
        }else{ roomtype.setrType(null); }

        if (area!=""){
            roomtype.setArea(area);
        }else{ roomtype.setArea(null); }

        if (liveNum!=""){
            roomtype.setLiveNum(Integer.valueOf(liveNum));
        }else {roomtype.setLiveNum(0);}

        if (price!=""){
            roomtype.setPrice(Double.parseDouble(price));
        }else {roomtype.setPrice(0);}
        System.out.println(3);
        if (bedNum!=""){
            roomtype.setBedNum(Integer.valueOf(bedNum));
        }else{roomtype.setBedNum(0);}
        if (roomNum!=""){
            roomtype.setRoomNum(Integer.valueOf(roomNum));
        }else {roomtype.setRoomNum(0);}
        if (fId!=""){
            roomtype.setfId(Integer.valueOf(fId));
        }else {roomtype.setfId(0);}
        System.out.println(1);
        System.out.println(roomtype);

        boolean flag= roomtypeService.updateType(roomtype);
        if(flag){
            resp.sendRedirect("roomtypemanage.action");
//            req.getRequestDispatcher("roomtypemanage.action").forward(req,resp);
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

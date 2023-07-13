package com.hotel.action;

import com.hotel.bean.Reserve;
import com.hotel.service.IReserveService;
import com.hotel.service.impl.IReserveServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author gmx
 * 添加预定信息
 */
@WebServlet("/addreserve.action")
public class AddReserveAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IReserveService reserveService=new IReserveServiceImpl();
        //创建预定对象
        Reserve reserve=new Reserve();
        //得到前端穿过来的值
        String gIdStr=req.getParameter("gId");
        String name=req.getParameter("name");
        String idNumber=req.getParameter("idNumber");
        String tel=req.getParameter("tel");
        String arriveTime=req.getParameter("arriveTime");
        String leaveTime=req.getParameter("leaveTime");
        //将gId转换为int类型
        int gId=Integer.valueOf(gIdStr);
        reserve.setgId(gId);
        reserve.setName(name);
        reserve.setIdNumber(idNumber);
        reserve.setTel(tel);
        //将日期转换为date类型
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            reserve.setArriveTime(simpleDateFormat.parse(arriveTime));
            reserve.setLeaveTime(simpleDateFormat.parse(leaveTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        boolean flag= reserveService.addRes(reserve);
        System.out.println(flag);
        if (flag){
            req.getRequestDispatcher("reserve.action").forward(req,resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

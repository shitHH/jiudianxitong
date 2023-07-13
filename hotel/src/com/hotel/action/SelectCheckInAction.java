package com.hotel.action;

import com.hotel.bean.CheckIn;
import com.hotel.service.ICheckInService;
import com.hotel.service.impl.CheckInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectcheckin.action")
public class SelectCheckInAction  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ICheckInService checkInService=new CheckInServiceImpl();
        String idNumber=req.getParameter("idNumber");
        List<CheckIn> checkIns=checkInService.findListByIdNumber(idNumber);

        req.setAttribute("checkIns",checkIns);
        if(checkIns!=null){
            //页面转发
            req.getRequestDispatcher("selectCheckIn.jsp").forward(req,resp);
        }else{
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

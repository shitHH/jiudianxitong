package com.hotel.action;

import com.hotel.bean.Clientinfo;
import com.hotel.service.IClientinfoService;
import com.hotel.service.impl.IClientinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author lk
 * 更新客户信息控制器
 */
@WebServlet("/upcin.action")
public class UpdateClientinfoAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建对象
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        String cId = req.getParameter("cId");
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String tel = req.getParameter("tel");
        String checkInTime = req.getParameter("checkInTime");
        String checkOutTime = req.getParameter("checkOutTime");
        String level = req.getParameter("level");
        String idNumber = req.getParameter("idNumber");

        Clientinfo clientinfo = new Clientinfo();

        clientinfo.setcId(Integer.valueOf(cId));
        clientinfo.setName(name);
        clientinfo.setName(sex);
        clientinfo.setTel(tel);
        SimpleDateFormat format = new SimpleDateFormat();
        try {
            clientinfo.setCheckInTime(format.parse(checkInTime));
            clientinfo.setCheckOutTime(format.parse(checkOutTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        clientinfo.setLevel(Integer.valueOf(level));
        clientinfo.setIdNumber(idNumber);
        boolean flag = clientinfoService.updateCin(clientinfo);
        System.out.println(flag);
        if (flag) {
            req.getRequestDispatcher("clientinfo.action").forward(req, resp);
        } else {
            req.setAttribute("message", "更新失败");
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        }
    }


}


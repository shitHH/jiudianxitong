package com.hotel.action;

import com.hotel.bean.Clientinfo;
import com.hotel.service.IClientinfoService;
import com.hotel.service.impl.IClientinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author lk
 * 添加客户信息控制器
 */
@WebServlet("/addcin.action")
public class AddClientinfoAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(1);
        //创建对象
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String tel = req.getParameter("tel");
        String checkInTime = req.getParameter("checkInTime");
        String checkOutTime = req.getParameter("checkOutTime");
        String level = req.getParameter("level");
        String idNumber = req.getParameter("idNumber");
        Clientinfo clientinfo = new Clientinfo();
        clientinfo.setName(name);
        clientinfo.setSex(sex);
        clientinfo.setTel(tel);
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        try {
            clientinfo.setCheckInTime(formatter.parse(checkInTime));
            clientinfo.setCheckOutTime(formatter.parse(checkOutTime));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        clientinfo.setLevel(Integer.valueOf(level));
        clientinfo.setIdNumber(idNumber);
        boolean flag =clientinfoService.addCin(clientinfo);
        HttpSession session= req.getSession();
        session.setAttribute("clientinfo",clientinfo);
        if (flag){
            req.getRequestDispatcher("clientinfo.action").forward(req,resp);

        }else{
            req.setAttribute("message","添加失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);//委托
    }
}

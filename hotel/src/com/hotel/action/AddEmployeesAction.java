/**
 * @author zyz
 * @create 2021-03-12 17:36
 **/

package com.hotel.action;

import com.hotel.bean.Employees;
import com.hotel.service.IEmployeeService;
import com.hotel.service.impl.IEmployeeServiceImpl;
import com.hotel.util.DateUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/addemployees.action")
public class AddEmployeesAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IEmployeeService employeeService = new IEmployeeServiceImpl();
        String name = req.getParameter("eName");
        String sex = req.getParameter("eSex");
        String age = req.getParameter("eAge");
        String tel = req.getParameter("eTel");

        //String birthday = req.getParameter("eBirthday");
        String year=req.getParameter("year");
        String month=req.getParameter("month");
        String day=req.getParameter("day");
        String addr = req.getParameter("eAddr");
        String did = req.getParameter("dId");
        Employees employees=new Employees();
        employees.seteName(name);
        employees.seteSex(sex);
        System.out.println(age);
        System.out.println(sex);
        //将年龄转换成整形
        int a=Integer.valueOf(age);
        employees.seteAge(a);
        employees.seteTel(tel);
        Date birthday= DateUtil.getDate(year,month,day);
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
        String bir=formatter.format(birthday);
        try {
            employees.seteBirthday(formatter.parse(bir));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        employees.seteAddr(addr);
        int d_id=Integer.valueOf(did);
        employees.setdId(d_id);
        boolean flag=employeeService.addEmp(employees);
        if (flag){
            resp.sendRedirect("employeeslist.action");
        }else{
            req.setAttribute("message","添加失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }


}

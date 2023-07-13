

package com.hotel.action;
/**
 * @author zyz
 * @create 2021-03-11 14:18
 * 员工列表控制器
 **/
import com.hotel.bean.Employees;
import com.hotel.service.IEmployeeService;
import com.hotel.service.impl.IEmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet("/employeeslist.action")
public class EmployeesAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IEmployeeService employeeService = new IEmployeeServiceImpl();
        List<Employees> list=employeeService.selectAll();
        //System.out.println(list);
        //创建session对象
        HttpSession session = req.getSession();
        //将员工列表放入session中
        session.setAttribute("list",list);
        //转发到员工列表页面中
        req.getRequestDispatcher("employeeslist.jsp").forward(req,resp);


    }






    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

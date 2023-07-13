/**
 * @author zyz
 * @create 2021-03-14 16:03
 **/

package com.hotel.action;

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
@WebServlet("/searchemployees.action")
public class SearchEmployeesAction extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IEmployeeService employeeService=new IEmployeeServiceImpl();
        String eid=req.getParameter("eId");
        int id=Integer.valueOf(eid);
        Employees employees=employeeService.selectOne(id);
        //创建session对象
        HttpSession session = req.getSession();
        //将员工信息放入session中
        session.setAttribute("employee",employees);
        //转发到员工列表页面中
        req.getRequestDispatcher("employeelist.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

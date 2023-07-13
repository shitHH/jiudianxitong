/**
 * @author zyz
 * @create 2021-03-12 10:03
 **/

package com.hotel.action;

import com.hotel.bean.Department;
import com.hotel.service.IDepartmentService;
import com.hotel.service.impl.IDepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
@WebServlet("/department.action")
public class DepartmentAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IDepartmentService departmentService=new IDepartmentServiceImpl();
        List<Department> list=departmentService.selectAll();
        System.out.println(list);
        //创建session对象
        HttpSession session = req.getSession();
        //将部门列表放入session中
        session.setAttribute("list",list);
        System.out.println(list);
        //转发到部门列表页面中
        req.getRequestDispatcher("department.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

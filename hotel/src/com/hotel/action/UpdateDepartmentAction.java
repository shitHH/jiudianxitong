/**
 * @author zyz
 * @create 2021-03-15 20:12
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
import java.io.IOException;

@WebServlet("/updatedepartment.action")
public class UpdateDepartmentAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IDepartmentService departmentService=new IDepartmentServiceImpl();
        String name=req.getParameter("dName");
        String addr=req.getParameter("dAddr");
        String remark=req.getParameter("remark");
        Department department=new Department();
        System.out.println(department.getdName());

        department.setdName(name);
        department.setdAddr(addr);
        department.setRemark(remark);
        boolean flag= departmentService.updateDpt(department);
        if (flag){
            resp.sendRedirect("department.action");
        }else{
            req.setAttribute("message","更新失败");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

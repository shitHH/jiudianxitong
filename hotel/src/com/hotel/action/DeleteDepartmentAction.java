/**
 * @author zyz
 * @create 2021-03-15 20:18
 **/

package com.hotel.action;

import com.hotel.service.IDepartmentService;
import com.hotel.service.impl.IDepartmentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/deletedepartment.action")
public class DeleteDepartmentAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IDepartmentService departmentService = new IDepartmentServiceImpl();
        String did=req.getParameter("dId");
        if (did!=null){
            int id=Integer.valueOf(did);
            boolean flag=departmentService.deleteDpt(id);
            if (flag) {
                //重新定向到部门列表控制器

                resp.sendRedirect("department.action");
            }else {
                //转发到错误页面
                req.setAttribute("messgae","部门删除失败");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
        }else {
            //转发到错误页面
            req.setAttribute("message","id不能为空");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
        }




    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

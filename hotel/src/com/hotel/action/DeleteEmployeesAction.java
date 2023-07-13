
package com.hotel.action;
/**
 * @author zyz
 * @create 2021-03-12 15:21
 * 员工删除控制器
 **/

import com.hotel.service.IEmployeeService;
import com.hotel.service.impl.IEmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/delete.action")
public class DeleteEmployeesAction extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IEmployeeService employeeService =new IEmployeeServiceImpl();
        //通过request的员工输入的ID
        String idstr=req.getParameter("eId");
        System.out.println(idstr);
        if(idstr!=null){
            int id=Integer.valueOf(idstr);

            boolean flag=employeeService.delete(id);
            if (flag) {
                //重新定向到员工列表控制器

                resp.sendRedirect("employeeslist.action");
            }else {
                //转发到错误页面
                req.setAttribute("messgae","人员删除失败");
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

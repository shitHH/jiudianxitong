package com.hotel.action;

import com.hotel.service.IClientinfoService;
import com.hotel.service.impl.IClientinfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author lk
 * 删除客户信息控制器
 */
@WebServlet("/dcin.action")
public class DeleteClientinfoAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建对象
        IClientinfoService clientinfoService = new IClientinfoServiceImpl();
        //得到客户的id
        String str= req.getParameter("cId");
        if (str!=null){
            //将id从String转换位int类型
            int cId = Integer.valueOf(str);
            boolean flag = clientinfoService.deleteCin(cId);
            if (flag){
                //成功后重定向到客户列表控制器
                resp.sendRedirect("clientinfo.action");
            }else {
                //失败则转发到错误页面
                req.setAttribute("message","客户删除失败");
                req.getRequestDispatcher("error.jsp").forward(req,resp);
            }
        }else{
            req.setAttribute("message","客户eId不能为空");
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);//委托
    }
}

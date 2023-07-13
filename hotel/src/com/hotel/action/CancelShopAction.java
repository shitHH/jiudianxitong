package com.hotel.action;

import com.hotel.service.IShoppingTrolleyService;
import com.hotel.service.impl.IShoppingTrolleyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xu
 * 通过sid删除商品订单控制器
 */
@WebServlet("/cancelShop.action")
public class CancelShopAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IShoppingTrolleyService shoppingTrolleyService=new IShoppingTrolleyServiceImpl();
        //获取前端传来的sid值
        String sid=req.getParameter("sid");
        //转换为整数
        int sId=Integer.valueOf(sid);
        int i=shoppingTrolleyService.delectProducts(sId);
        if (i>0){
            req.getRequestDispatcher("userShoppingTrolley.action").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

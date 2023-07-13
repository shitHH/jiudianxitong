package com.hotel.action;

import com.hotel.bean.ShoppingTrolley;
import com.hotel.service.IShoppingTrolleyService;
import com.hotel.service.impl.IShoppingTrolleyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/userShop.action")
public class UserShopAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IShoppingTrolleyService shoppingTrolleyService=new IShoppingTrolleyServiceImpl();
        List<ShoppingTrolley> shoppingTrolleys=shoppingTrolleyService.allShoppingTrolley();
        HttpSession session= req.getSession();
        session.setAttribute("shoppingTrolleys",shoppingTrolleys);
        req.getRequestDispatcher("userShop.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

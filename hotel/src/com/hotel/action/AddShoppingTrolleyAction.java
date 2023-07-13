package com.hotel.action;

import com.hotel.bean.ShoppingTrolley;
import com.hotel.bean.User;
import com.hotel.service.IShoppingTrolleyService;
import com.hotel.service.impl.IShoppingTrolleyServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author xu
 * 增加购物车商品
 */
@WebServlet("/addShoppingTrolley.action")
public class AddShoppingTrolleyAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IShoppingTrolleyService shoppingTrolleyService=new IShoppingTrolleyServiceImpl();
        //获得前端传来的pId
        int pId=Integer.valueOf(req.getParameter("pId"));
        System.out.println(pId);
        //获得user的uId
        HttpSession session=req.getSession();
        User user=(User)session.getAttribute("user1");
        int uId= user.getuId();
        ShoppingTrolley shoppingTrolley=new ShoppingTrolley();
        shoppingTrolley.setuId(uId);
        shoppingTrolley.setpId(pId);
        int i=shoppingTrolleyService.addShoppingTrolley(shoppingTrolley);
        if (i>0){
            req.getRequestDispatcher("showProduct.jsp").forward(req,resp);
        }else {
            resp.sendRedirect("error.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

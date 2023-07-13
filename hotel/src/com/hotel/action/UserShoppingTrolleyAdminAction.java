package com.hotel.action;

import com.hotel.bean.ShoppingTrolley;
import com.hotel.bean.User;
import com.hotel.service.IShoppingTrolleyService;
import com.hotel.service.IUserService;
import com.hotel.service.impl.IShoppingTrolleyServiceImpl;
import com.hotel.service.impl.IUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author xu
 * 用户商品购物车
 */
@WebServlet("/UserShoppingTrolleyAdmin.action")
public class UserShoppingTrolleyAdminAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建业务逻辑对象
        IShoppingTrolleyService shoppingTrolleyService=new IShoppingTrolleyServiceImpl();
        IUserService userService=new IUserServiceImpl();
        String id=req.getParameter("uid");
        int uid =Integer.valueOf(id);
        HttpSession session= req.getSession();
        User user=userService.findId(uid);
        if (user!=null){
            List<ShoppingTrolley> shoppingTrolleys=shoppingTrolleyService.userShoppingTrolley(user.getuId());
            Double sumPrice = shoppingTrolleyService.findUserActionSUm(user.getuId());
            session.setAttribute("sumPrice",sumPrice);
            session.setAttribute("shoppingTrolleys",shoppingTrolleys);
            req.setAttribute("user",user);
            req.getRequestDispatcher("userShoppingTrolleyAdmin.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("userShop.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

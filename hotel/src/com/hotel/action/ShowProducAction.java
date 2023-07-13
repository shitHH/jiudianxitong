package com.hotel.action;

import com.hotel.bean.Products;
import com.hotel.service.IProductsService;
import com.hotel.service.impl.IProductsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/showProduct.action")
public class ShowProducAction  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建实例对象
        IProductsService productsService=new IProductsServiceImpl();
        List<Products> productsList= productsService.selectAll();
        if (productsList!=null){
            HttpSession session= req.getSession();
            session.setAttribute("productsList",productsList);
            req.getRequestDispatcher("showProduct.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

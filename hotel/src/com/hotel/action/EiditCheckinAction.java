

package com.hotel.action;

import com.hotel.bean.GuestRoom;
import com.hotel.service.ICheckInService;
import com.hotel.service.IGuestRoomService;
import com.hotel.service.impl.CheckInServiceImpl;
import com.hotel.service.impl.GuestRoomServiceImpl;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author gmx
 * 客户换房控制器
 */
@WebServlet("/editcheckin.action")
public class EiditCheckinAction extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter out= resp.getWriter();
      JSONObject json=new JSONObject();
      IGuestRoomService guestRoomService=new GuestRoomServiceImpl();
      List<GuestRoom> list=guestRoomService.findAll();
      List list1=new ArrayList();
      for(GuestRoom guestRoom:list){
          if(guestRoom.getState().equals("未预订")){
              list1.add(guestRoom.getHouseNum());
          }
      }
        json.put("list",list1);
        out.println(json.toString());
//        String gIdStr=req.getParameter("gId");
//        System.out.println(gIdStr);
//        //获取当前客户所在的房间号
//        String gid2Str=req.getParameter("gId2");
//        System.out.println(gid2Str);
//        int gId=Integer.valueOf(gIdStr);
//        int gId2=Integer.valueOf(gid2Str);
//        //获得房间对象
//        GuestRoom guestRoom= guestRoomService.findByGId(gId);
//        GuestRoom guestRoom1=guestRoomService.findByGId(gId2);
//        //获取要换去的房间状态
//        String state=guestRoom.getState();
//        System.out.println(state);
//        //获取当前房间状态
//        String state1=guestRoom1.getState();
//        if(state.equals("未预订")){
//            //设置房间状态
//            guestRoom.setState("已入住");
//            guestRoomService.update(guestRoom);
//            guestRoom1.setState("未预订");
//            guestRoomService.update(guestRoom1);
//            req.getRequestDispatcher("checkin.action").forward(req,resp);
//        }else{
//            req.getRequestDispatcher("error.jsp").forward(req,resp);
//        }


      out.flush();
      out.close();




    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

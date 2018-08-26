package com.lzw.car.web;

import com.lzw.car.dao.CarInMemoryDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CarDel extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        CarInMemoryDAO dao=new CarInMemoryDAO();
        String msg=null;

        if (dao.delete(id)){
            msg="delete success";
        }else {
            msg="delete failure";
        }
        req.getSession().setAttribute("msg",msg);

        resp.sendRedirect("");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids=req.getParameterValues("id");
        CarInMemoryDAO dao=new CarInMemoryDAO();
        for(String id: ids){
            dao.delete(Integer.parseInt(id));
        }
        req.getSession().setAttribute("msg","删除成功!");

        resp.sendRedirect("/car/index");
    }
}

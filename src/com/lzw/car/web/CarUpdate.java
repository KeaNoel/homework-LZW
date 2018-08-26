package com.lzw.car.web;

import com.lzw.car.dao.CarDAO;
import com.lzw.car.dao.CarInMemoryDAO;
import com.lzw.car.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class CarUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        CarDAO carDAO=new CarInMemoryDAO();
        Car car=carDAO.getCarByid(id);
        req.setAttribute("car",car);
        req.getRequestDispatcher("").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");

        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        float price=Float.parseFloat(req.getParameter("price"));
        String factory=req.getParameter("factory");
        String productiontime=req.getParameter("productiontime");

        Car car=new Car(id,name,price,factory,productiontime);

        CarDAO carDAO=new CarInMemoryDAO();
        carDAO.update(car);

        HttpSession session=req.getSession();
        session.setAttribute("msg","更新成功！");

        resp.sendRedirect("/car/detail?id="+id);

    }
}

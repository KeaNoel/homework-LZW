package com.lzw.car.web;

import com.lzw.car.dao.CarDAO;
import com.lzw.car.dao.CarInMemoryDAO;
import com.lzw.car.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CarSearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String condition = req.getParameter("condition");

        CarDAO carDAO=new CarInMemoryDAO();
        List<Car> cars=carDAO.getCarsByName(condition);

        req.setAttribute("cars",cars);

        req.getSession().setAttribute("msg","当前查询条件为：{"+condition+"}");

        req.getRequestDispatcher("/jsp/car_list_ajax,jsp").include(req,resp);
    }
}

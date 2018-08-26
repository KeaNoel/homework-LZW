package com.lzw.car.web;

import com.lzw.car.dao.CarDAO;
import com.lzw.car.dao.CarInMemoryDAO;
import com.lzw.car.entity.Car;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/index")

public class CarList extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        CarDAO carDAO=new CarInMemoryDAO();
        List<Car> cars=carDAO.listAll();
        req.setAttribute("cars",cars);

        req.getRequestDispatcher("/WEB-INF/jsp/car_list.jsp").forward(req,resp);
    }
}

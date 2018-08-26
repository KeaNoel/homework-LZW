package com.lzw.car.dao;

import com.lzw.car.entity.Car;

import java.util.List;


public interface CarDAO {
    List<Car> listAll();
    Car getCarByid(int id);
    List<Car> getCarsByName(String name);
    boolean update(Car car);
    boolean delete(int id);
    Car  add(Car car);
}

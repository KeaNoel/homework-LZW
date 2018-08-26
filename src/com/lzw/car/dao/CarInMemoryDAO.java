package com.lzw.car.dao;

import com.lzw.car.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarInMemoryDAO implements  CarDAO {

    private static List<Car> carDB=new ArrayList<>();

    static {
        Car c1=new Car(1,"大众",400000,"德国","2018");
        Car c2=new Car(2,"别克",3500000,"美国","2017");
        Car c3=new Car(3,"雪佛兰",200000,"美国","2017");
        Car c4=new Car(4,"保时捷",200000,"德国","2018");
        Car c5=new Car(5,"宝马",600000,"德国","2018");
        Car c6=new Car(6,"玛莎拉蒂",1000000,"意大利","2018");

        carDB.add(c1);
        carDB.add(c2);
        carDB.add(c3);
        carDB.add(c4);
        carDB.add(c5);
        carDB.add(c6);

    }

    @Override
    public List<Car> listAll() {
        return carDB;
    }

    @Override
    public Car getCarByid(int id) {
        for(Car car: carDB){
            if(car.getId()==id){
                return car;
            }
        }
        return null;
    }

    @Override
    public List<Car> getCarsByName(String name) {
       ArrayList<Car>cars=new ArrayList<>();
       for(Car car:carDB){
           String realName=car.getName().toLowerCase();
           if(realName.contains(name.toLowerCase())){
               cars.add(car);
           }
       }
        return cars;
    }

    @Override
    public boolean update(Car car) {

        for(Car carNew : carDB){
            if (carNew.getId()==car.getId()){
                carNew.setName(car.getName());
                carNew.setPrice(car.getPrice());
                carNew.setFactory(car.getFactory());
                carNew.setProductiontime(car.getProductiontime());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        for(Car car:carDB){
            if (car.getId()==id){
                return carDB.remove(car);
            }
        }
        return false;
    }
    @Override
    public Car add(Car car) {
        if(carDB.add(car)){
            return car;
        }
        return null;
    }
}

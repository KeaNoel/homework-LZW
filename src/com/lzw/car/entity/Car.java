package com.lzw.car.entity;

public class Car {
    private int id;
    private String name;
    private float price;
    private String factory;
    private String productiontime;

    public Car() {
    }

    public Car(String name, float price, String factory, String productiontime) {
        this.name = name;
        this.price = price;
        this.factory = factory;
        this.productiontime = productiontime;
    }

    public Car(int id, String name, float price, String factory, String productiontime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.factory = factory;
        this.productiontime = productiontime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getProductiontime() {
        return productiontime;
    }

    public void setProductiontime(String productiontime) {
        this.productiontime = productiontime;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                '}';
    }
}

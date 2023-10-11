package com.easyBuy.spring.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class HelloSpring {
    @Value("百里奚")
    private String name;
    @Value("20")
    private int age;
    @Value("180")
    private float height;
    @Value("10.0")
    private double price;

    private List list;
    private Map map;


    public HelloSpring() {
    }
    public HelloSpring(String name, int age, float height, float price, List list, Map map) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.price = price;
        this.list = list;
        this.map = map;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "HelloSpring{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", price=" + price +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}

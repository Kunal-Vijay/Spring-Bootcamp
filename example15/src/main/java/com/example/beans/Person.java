package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="PersonBean")
public class Person {
    private String name = "Lucy";
    private final Vehicle vehicle;

    @Autowired
    public  Person(Vehicle vehicle){
        System.out.println("Person bean is created ");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

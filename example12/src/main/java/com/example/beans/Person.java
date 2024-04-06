package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Lucy";  // Can also use Post construct this is just for simplicity
    /*
The @Autowired annotation marks on a field, constructor, Setter method
is used to auto-wire the beans that is 'injecting beans' (Objects) at runtime
by Spring Dependency Injection mechanism
* */

    private  Vehicle vehicle; // can declare final in constructor auto wiring

//    @Autowired - optional by default consider if only one constructor
    public Person(Vehicle vehicle) {
        System.out.println("Person bean is created");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

//    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

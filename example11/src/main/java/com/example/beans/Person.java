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
    @Autowired(required = false) // if bean is not created - check by removing @Component from Vehicle so it can't scan it for autowiring
    private Vehicle vehicle;

    public Person() {
        System.out.println("Person bean is created");
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

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

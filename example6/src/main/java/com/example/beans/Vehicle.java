package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name = "Honda";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initialize(){
        this.name = "Honda";
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Vehicle bean destroyed");
    }

    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
}

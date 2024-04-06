package com.example.beans;

import jakarta.annotation.PostConstruct;
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

    public void printHello(){
        System.out.println("Printing hello from component vehicle bean");
    }
}

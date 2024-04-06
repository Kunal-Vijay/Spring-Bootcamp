package com.example.main;

import com.example.beans.Vehicle;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class example8 {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is :" + veh.getName());
    }
}

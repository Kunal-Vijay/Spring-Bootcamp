package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class example9 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);
//        System.out.println("Vehicle name from Spring context is :" + vehicle.getName());
        System.out.println("Person name from Spring context is :" + person.getName());
        System.out.println("Vehicle name of person from Spring context is :" + person.getVehicle());
    }
}

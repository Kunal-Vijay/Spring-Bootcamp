package com.example.main;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class example15 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean(VehicleServices.class);
        System.out.println("Hashcode for vehicleServices1:"+vehicleServices1.hashCode());
        System.out.println("Hashcode for vehicleServices1:"+vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("VehicleServices bean is singleton scoped bean");
        }

//        Lazy bean
        System.out.println("Before retrieving the person beans");
        Person person = context.getBean(Person.class);
        System.out.println("After retrieving the person beans");

    }
}

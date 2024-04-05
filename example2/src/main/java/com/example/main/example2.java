package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


//      Vehicle veh = context.getBean(Vehicle.class);  error No Unique Bean exception
        Vehicle veh = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        veh = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        veh = context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}

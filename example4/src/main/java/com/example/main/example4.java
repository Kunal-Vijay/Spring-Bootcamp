package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class example4 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);


      Vehicle veh = context.getBean(Vehicle.class); // No error this time due to primary annotation
      System.out.println("Vehicle name from Spring Context is: " + veh.getName());
    }
}

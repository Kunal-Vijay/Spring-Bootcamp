package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    /*
    @Bean annotation, which lets Spring know that it needs to call
this method when it initializes its context and adds the returned
value to the context.
*/
    @Bean(name="audiVehicle")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean(value="ferrariVehicle")
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
    @Primary
    @Bean("hondaVehicle")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}

package com.example.implementation;

import com.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers  {
    public String makeSound(){
        return "Playing music with sony speakers";
    }
}

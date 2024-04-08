package com.example.implementation;

import com.example.interfaces.Speakers;
import com.example.model.Song;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers  {
    public String makeSound(Song  song){
        return "Playing song"+song.getTitle()+" by "+song.getSingerName()+ " with sony speakers";
    }
}

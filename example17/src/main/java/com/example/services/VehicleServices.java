package com.example.services;

import com.example.interfaces.LogAspect;
import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import com.example.model.Song;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="VehicleServicesBean")
public class VehicleServices {
//    private Logger logger = Logger.getLogger(VehicleServices.class.getName());
    @Autowired
    private Speakers speakers;
    private Tyres tyres;
    @LogAspect
    public String playMusic(boolean vehicleStarted, Song song){
//        Instant start = Instant.now();
//        logger.info("playMusic method execution start");
//        String music =null;
//        if(VehicleStarted){
//            music = speakers.makeSound(song);
//        }else{
//            logger.log(Level.SEVERE,"Vehicle is not started to perform the operation");
//        }
//        logger.info("playMusic method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute playMusic method: "+timeElapsed);
//        return music;
        return speakers.makeSound(song);
    }

    public String moveVehicle(boolean vehicleStarted){
//        Instant start = Instant.now();
//        logger.info("moveVehicle method execution start");
//        String status = null;
//        if(VehicleStarted){
//            status = tyres.rotate();
//        }else{
//            logger.log(Level.SEVERE,"Vehicle is not started to perform the operation");
//        }
//        logger.info("moveVehicle method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute moveVehicle method: "+timeElapsed);
//        return status;
    return tyres.rotate();
    }

    public String applyBrake(boolean vehicleStarted){
//        Instant start = Instant.now();
//        logger.info("applyBrake method execution start");
//        String status = null;
//        if(vehicleStarted){
//            status = tyres.stop();
//        }else{
//            logger.log(Level.SEVERE,"Vehicle is not started to perform the operation");
//        }
//        logger.info("applyBrake method execution end");
//        Instant finish = Instant.now();
//        long timeElapsed = Duration.between(start,finish).toMillis();
//        logger.info("Time took to execute applyBrake method: "+timeElapsed);
//        return status;
//        throw new NullPointerException("Self created null pointer exception");
        return tyres.stop();
    }
    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }
    @Autowired
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}

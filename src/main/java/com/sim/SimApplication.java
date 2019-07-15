package com.sim;

import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sim.service.SensorService;

@SpringBootApplication
@EnableScheduling
public class SimApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimApplication.class, args);
    }

}

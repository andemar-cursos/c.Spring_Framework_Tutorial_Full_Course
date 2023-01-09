package com.andemar.object;

import com.andemar.interfaces.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Its a Bike");
    }
}

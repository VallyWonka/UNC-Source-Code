package com.example;

import com.example.model.Car;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarManagerTest {

    @Test
    public void generateCar() {
        CarManager carManager = new CarManager();

        Car car =  carManager.generateCar();
        Car car1 = carManager.generateCar();

        assertEquals(car, car1);
    }
}
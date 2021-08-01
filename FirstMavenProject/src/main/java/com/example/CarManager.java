package com.example;

import com.example.model.Car;
import com.example.model.Color;
import com.example.model.Size;

public class CarManager {
    public Car generateCar() {
        return new Car(
                new Size(10,20),
                new Color(0,0,0)
        );
    }
}

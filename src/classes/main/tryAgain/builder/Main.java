package classes.main.tryAgain.builder;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder = new Car.CarBuilder();

        UUID.fromString("96496b62-329c-4885-a0a4-5865584b4d4a");

        Car car  = carBuilder
                .buildEngine(new Engine(10))
                .buildWheels(new Wheels(10))
                .buildColor(new Color(10,10,10))
                .build();



        System.out.println(car);
    }
}

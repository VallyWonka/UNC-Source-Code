package classes.main.tryAgain.builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        Car car  = carBuilder
                //.buildEngine(new Engine(10))
                //.buildWheels(new Wheels(10))
                //.buildColor(new Color(10,10,10))
                .build();


        System.out.println(car);
    }
}

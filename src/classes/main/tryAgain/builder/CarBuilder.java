package classes.main.tryAgain.builder;

public class CarBuilder {

    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public CarBuilder buildEngine(Engine engine){
        car.setEngine(engine);
        return this;
    }

    public CarBuilder buildWheels(Wheels wheels){
        car.setWheels(wheels);
        return this;
    }

    public CarBuilder buildColor(Color color){
        car.setColor(color);
        return this;
    }

    public Car build(){
        return car;
    }

}

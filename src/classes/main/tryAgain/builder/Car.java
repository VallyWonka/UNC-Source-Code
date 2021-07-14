package classes.main.tryAgain.builder;

public class Car {
    private Engine engine;
    private Wheels wheels;
    private Color color;

    protected Car(Engine engine, Wheels wheels, Color color) {
        this.engine = engine;
        this.wheels = wheels;
        this.color = color;
    }

    public void move(){}

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheels=" + wheels +
                ", color=" + color +
                '}';
    }

    public static class CarBuilder {

        private Engine engine;
        private Wheels wheels;
        private Color color;

        public CarBuilder buildEngine(Engine engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder buildWheels(Wheels wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder buildColor(Color color){
            this.color = color;
            return this;
        }

        public Car build(){
            if(engine == null || wheels == null || color == null)
                return null;
            return new Car(engine, wheels, color);
        }
    }
}

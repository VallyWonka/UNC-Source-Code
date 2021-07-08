package hw.shapes;


public class Circle implements Shape{

    private double radius;

    public Circle(double radius) throws IllegalArgumentException {
        if (radius > 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "Circle {" +
                "radius=" + radius +
                '}';
    }
}

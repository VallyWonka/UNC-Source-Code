package hw.shapes;


public class Square implements Shape {

    private double side;

    public Square(double side) throws IllegalArgumentException {
        if (side > 0) {
            this.side = side;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Square {" +
                "side=" + side +
                '}';
    }
}

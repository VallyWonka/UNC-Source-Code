package hw.shapes;


public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = (new Square(5));
        shapes[1] = (new Triangle(4, 13, 15));
        shapes[2] = (new Circle(4));
        shapes[3] = (new Ellipse(4, 5));

        for (Shape shape : shapes) {
            System.out.format("Area of %s is %.2f.\n", shape, shape.getArea());
        }
    }
}

package hw.shapes;


public class Ellipse implements Shape{

    private double semiMajorAxis;
    private double semiMinorAxis;

    public Ellipse(double semiMajorAxis, double semiMinorAxis) throws IllegalArgumentException {
        if ((semiMajorAxis > 0) && (semiMinorAxis > 0)) {
            this.semiMajorAxis = semiMajorAxis;
            this.semiMinorAxis = semiMinorAxis;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public double getArea() {
        return Math.PI * this.semiMinorAxis * this.semiMajorAxis;
    }

    @Override
    public String toString() {
        return "Ellipse {" +
                "semiMajorAxis=" + semiMajorAxis +
                ", semiMinorAxis=" + semiMinorAxis +
                '}';
    }
}

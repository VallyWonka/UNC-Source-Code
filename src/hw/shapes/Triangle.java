package hw.shapes;


public class Triangle implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    private double semiPerimeter;

    public Triangle(double sideA, double sideB, double sideC) throws IllegalArgumentException {
        if ((sideA > 0) && (sideB > 0) && (sideC > 0)
            && (sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException();
        }

        this.semiPerimeter = countSemiParameter();
    }

    private double countSemiParameter() {
        return (this.sideA + this.sideB + this.sideC) / 2;
    }

    @Override
    public double getArea() {
        return Math.sqrt(this.semiPerimeter
                * (this.semiPerimeter - this.sideA)
                * (this.semiPerimeter - this.sideB)
                * (this.semiPerimeter - this.sideC));
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}

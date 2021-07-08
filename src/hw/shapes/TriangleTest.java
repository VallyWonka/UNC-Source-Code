package hw.shapes;


import org.junit.Assert;
import org.junit.Test;


public class TriangleTest {

    @Test
    public void getCorrectArea() {
        Triangle triangle = new Triangle(5, 5, 6);

        double actualResult = triangle.getArea();
        double expectedResult = 12.0;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenAGiantTriangle() {
        Triangle triangle = new Triangle(5555, 5555, 6666);

        double actualResult = triangle.getArea();
        double expectedResult = 14811852.0;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenATinyTriangle() {
        Triangle triangle = new Triangle(0.005, 0.005, 0.006);

        double actualResult = triangle.getArea();
        double expectedResult = 0.000012;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sidesOfZeroNotAllowed() throws IllegalArgumentException {
        Triangle triangle = new Triangle(0, 5, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeSidesNotAllowed() throws IllegalArgumentException {
        Triangle triangle = new Triangle(5, -5, 6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void triangleDoesNotExist() throws IllegalArgumentException {
        Triangle triangle = new Triangle(55, 5, 6);
    }

}

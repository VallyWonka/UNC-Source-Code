package hw.shapes;


import org.junit.Assert;
import org.junit.Test;


public class CircleTest {

    @Test
    public void getCorrectArea() {
        Circle circle = new Circle(6);

        double actualResult = circle.getArea();
        double expectedResult = Math.PI * 36.0;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenAGiantCircle() {
        Circle circle = new Circle(6666);

        double actualResult = circle.getArea();
        double expectedResult = Math.PI * (6666 * 6666);

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenATinyCircle() {
        Circle circle = new Circle(0.006);

        double actualResult = circle.getArea();
        double expectedResult = Math.PI * (0.006 * 0.006);

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void radiusOfZeroNotAllowed() throws IllegalArgumentException {
        Circle circle = new Circle(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeRadiusNotAllowed() throws IllegalArgumentException {
        Circle circle = new Circle(-6);
    }

}

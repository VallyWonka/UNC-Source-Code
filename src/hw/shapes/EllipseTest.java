package hw.shapes;


import org.junit.Assert;
import org.junit.Test;


public class EllipseTest {

    @Test
    public void getCorrectArea() {
        Ellipse ellipse = new Ellipse(8, 4);

        double actualResult = ellipse.getArea();
        double expectedResult = Math.PI * 8 * 4;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenAGiantEllipse() {
        Ellipse ellipse = new Ellipse(8888, 4444);

        double actualResult = ellipse.getArea();
        double expectedResult = Math.PI * 8888 * 4444;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenATinyEllipse() {
        Ellipse ellipse = new Ellipse(0.008, 0.004);

        double actualResult = ellipse.getArea();
        double expectedResult = Math.PI * 0.008 * 0.004;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void semiAxesOfZeroNotAllowed() throws IllegalArgumentException {
        Ellipse ellipse = new Ellipse(0, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeSemiAxesNotAllowed() throws IllegalArgumentException {
        Ellipse ellipse = new Ellipse(8, -4);
    }

}

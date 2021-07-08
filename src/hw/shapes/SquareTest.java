package hw.shapes;


import org.junit.Assert;
import org.junit.Test;


public class SquareTest {

    @Test
    public void getCorrectArea() {
        Square square = new Square(6);

        double actualResult = square.getArea();
        double expectedResult = 36.0;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenAGiantSquare() {
        Square square = new Square(6666);

        double actualResult = square.getArea();
        double expectedResult = 6666 * 6666;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test
    public void getCorrectAreaGivenATinySquare() {
        Square square = new Square(0.006);

        double actualResult = square.getArea();
        double expectedResult = 0.006 * 0.006;

        Assert.assertEquals(actualResult, expectedResult, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sideOfZeroNotAllowed() throws IllegalArgumentException {
        Square square = new Square(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeSideNotAllowed() throws IllegalArgumentException {
        Square square = new Square(-6);
    }

}

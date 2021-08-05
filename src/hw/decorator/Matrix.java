package hw.decorator;

public interface Matrix {
    int getElement(int i, int j) throws ArrayIndexOutOfBoundsException;
    int getN();
    int getM();
}

package classes.myImplementations.dogCatMouse;

import java.util.Objects;

public class Point {
    private int X;
    private int Y;

    public Point(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Point)) return false;
        Point other = (Point) otherObject;
        return this.X == other.X && this.Y == other.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.X, this.Y);
    }

    @Override
    public String toString() {
        return String.format("<%d, %d>", this.X, this.Y);
    }
}

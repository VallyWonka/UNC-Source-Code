package classes.myImplementations.dogCatMouse;

public interface Animal {
    String getName();
    void move(int x, int y);
    Point getPoint();
    int getPriority();
    boolean isAlive();
    void setAlive(boolean alive);
}

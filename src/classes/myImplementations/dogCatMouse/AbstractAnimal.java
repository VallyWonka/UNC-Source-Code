package classes.myImplementations.dogCatMouse;

public abstract class AbstractAnimal implements Animal {
    protected final String name;
    protected Point point;
    protected final int priority;
    protected boolean alive = true;

    public AbstractAnimal(String name, Point point, int priority) {
        this.name = name;
        this.point = point;
        this.priority = priority;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void move(int x, int y) {
        System.out.format("%s has moved from %s to <%d, %d>.\n",
                this.name,
                this.point,
                x,
                y);
        this.point.setX(x);
        this.point.setY(y);
    }

    @Override
    public Point getPoint() {
        return this.point;
    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public int getPriority() {
        return priority;
    }

    public void eat(Animal animal) {
        if (animal.getPoint().equals(this.point)
                && animal.isAlive()
                && animal.getPriority() < this.priority) {
            System.out.format("%s has eaten %s.\n", this.name, animal.getName());
            animal.setAlive(false);
            return;
        }
        System.out.format("%s cannot eat %s.\n", this.name, animal.getName());
    }
}

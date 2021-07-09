package classes.main.interfaces.tomAndJerry;

public abstract class AbstractAnimal implements Animal {
    protected Point point;
    protected int priority;

    public AbstractAnimal(Point point, int priority) {
        this.point = point;
        this.priority = priority;
    }

    @Override
    public void move(Point point) {
        this.point = point;
    }

    @Override
    public Point getCurrentPoint() {
        return point;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public boolean eat(Animal animal) {
        if(this == animal){
            return false;
        }
        if(animal.getPriority() > this.priority){
            return false;
        }
        return true;
    }
}

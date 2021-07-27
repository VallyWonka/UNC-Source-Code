package classes.myImplementations.dogCatMouse;

public class Main {
    public static void main(String[] args) {
        Mouse mouse = new Mouse("Jerry", new Point(0, 0));
        Cat cat = new Cat("Tom", new Point(1, 1));
        Dog dog = new Dog("Spike", new Point(2, 2));

        mouse.move(3, 3);
        cat.move(3, 3);
        dog.move(3, 3);

        mouse.eat(dog);
        cat.eat(mouse);
        cat.eat(dog);
        dog.eat(mouse);
        dog.eat(cat);
    }
}

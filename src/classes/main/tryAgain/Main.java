package classes.main.tryAgain;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static classes.main.tryAgain.Constants.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(MY_FIRST_CONSTANT);
        GrandParent grandParent = new GrandParent();
        Parent parent = new Parent();
        Child child = new Child();

        //grandParent = parent;
        grandParent = child;

        System.out.println(grandParent.grandParentFlag);

        parent = (Child) grandParent;

        System.out.println(parent.parentFlag);
        System.out.println(parent.grandParentFlag);


        new Printer() {
            @Override
            public void print(String string) {
                System.out.println(string);
            }
        }.print("dsfdsfdsf");
    }
}

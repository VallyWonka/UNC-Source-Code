package classes.main.staticClass;

import java.util.ArrayList;

import static java.lang.Math.*;

public class M {
    public static void main(String[] args) {
        OrderingInitChecker checker = new OrderingInitChecker();
        OrderingInitChecker checker1 = new OrderingInitChecker();
        checker.equals(checker1);

        System.out.println(" fds fds ".trim());

        System.out.println(PI);
        System.out.println(E);

        OrderingInitChecker.NestedClass nestedClass = new OrderingInitChecker.NestedClass();
        nestedClass.doLogic();
    }

}

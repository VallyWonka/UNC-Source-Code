package classes.main.files;

import java.io.Console;

public class ConsoleMain {
    public static void main(String[] args) {
        Console console = System.console();

        if(console == null){
            System.exit(-1);
        }

        char[] password  = console.readPassword("Enter Password:");

        System.out.println(password);
    }
}

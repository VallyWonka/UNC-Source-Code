package hw.zoo.console;

import hw.zoo.ZooImpl;
import hw.zoo.console.commandFactory.CommandFactoryDirector;

import java.util.Scanner;

public class ConsoleParser {
    private ZooImpl zoo;
    private CommandFactoryDirector commandFactoryDirector;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleParser(ZooImpl zoo) {
        this.zoo = zoo;
        this.commandFactoryDirector = new CommandFactoryDirector(zoo);
    }

    private void sayHello() {
        System.out.println("Hello! Nice to see you here.");
    }

    private String scan(){
        return this.scanner.nextLine();
    }

    private String[] parse(String action) {
        return action.split("\s");
    }

    public void run() {
        this.sayHello();

        while (this.scanner.hasNextLine()) {
            String[] tokens = this.parse(this.scan());
            try {
                this.commandFactoryDirector.executeCommand(tokens);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

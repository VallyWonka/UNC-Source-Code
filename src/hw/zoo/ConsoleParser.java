package hw.zoo;

import hw.zoo.model.Animal;
import hw.zoo.model.AnimalFactory;

import java.util.Scanner;

public class ConsoleParser {
    private ZooImpl zoo;
    private Scanner scanner = new Scanner(System.in);

    public ConsoleParser(ZooImpl zoo) {
        this.zoo = zoo;
    }

    public void parse() {
        System.out.println("Hello! Nice to see you here.");

        while (true) {
            String action = this.scanner.nextLine();
            String[] tokens = action.split("\s");

            String command = tokens[0].toLowerCase();

            switch (command) {
                case "info" -> System.out.println(this.zoo.getInfoAboutZoo());

                case "check-in" -> {
                    try {
                        Animal animal = AnimalFactory.createAnimal(tokens[1], tokens[2]);
                        this.zoo.checkInAnimal(animal);
                        System.out.format("Successfully checked %s %s in!\n",
                                animal.getSpecies().toString().toLowerCase(),
                                animal.getName());
                    } catch (IllegalArgumentException | IllegalAccessException e) {
                        System.out.println(e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Please make sure that you provided both the name and the species " +
                                "of the Animal you want to check in.");
                    }
                }

                case "check-on" -> {
                    try {
                        System.out.println(this.zoo.checkOnAnimal(tokens[1]));
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Please make sure that you provided the name " +
                                "of the Animal you want to check on.");
                    }
                }

                case "check-out" -> {
                    try {
                        this.zoo.checkOutAnimal(tokens[1]);
                        System.out.format("Successfully checked %s out!\n", tokens[1]);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Please make sure that you provided the name of the Animal " +
                                "you want to check out.");
                    }
                }

                case "build" -> {
                    try {
                        this.zoo.buildCage(AnimalFactory.checkSpecies(tokens[1]),
                                Double.parseDouble(tokens[2]),
                                Integer.parseInt(tokens[3]));
                        System.out.println("Successfully built a new Cage! We are grateful for your contribution.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Please make sure you provided the correct species, area " +
                                "and capacity of the Cage you want to build in the given order.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Please make sure that you provided both the species, the area " +
                                "and the capacity of the Cage you want to build.");
                    }
                }

                case "log" -> this.zoo.getHistory().forEach(System.out::println);
                case "exit" -> {
                    System.out.println("Looking forward to seeing you again!");
                    System.exit(0);
                }
                default -> System.out.println("Sorry, I couldn't understand you. Available commands are: " +
                        "info, check-in, check-on, check-out, build, log, and exit.");
            }
        }
    }

}

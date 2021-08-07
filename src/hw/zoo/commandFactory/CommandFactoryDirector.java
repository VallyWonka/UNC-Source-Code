package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;

public class CommandFactoryDirector {
        private ZooImpl zoo;

        public CommandFactoryDirector(ZooImpl zoo) {
                this.zoo = zoo;
        }

        public Command getCommandExecutor(String command) {
                return switch (command) {
                        case "info" -> new InfoCommand(this.zoo);
                        case "check-in" -> new CheckInCommand(this.zoo);
                        case "check-on" -> new CheckOnCommand(this.zoo);
                        case "check-out" -> new CheckOutCommand(this.zoo);
                        case "build" -> new BuildCommand(this.zoo);
                        case "log" -> new LogCommand(this.zoo);
                        case "exit" -> new ExitCommand();
                        default -> throw new IllegalArgumentException("Sorry, I couldn't understand you. Available commands are: " +
                                "info, check-in, check-on, check-out, build, log, and exit.");
                };
        }
}
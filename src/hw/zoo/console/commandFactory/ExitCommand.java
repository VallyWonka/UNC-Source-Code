package hw.zoo.console.commandFactory;

public class ExitCommand extends Command {
    @Override
    public void executeCommand(String[] tokens) {
        {
            System.out.println("Looking forward to seeing you again!");
            System.exit(0);
        }
    }
}

package hw.zoo.commandFactory;

import hw.zoo.ZooImpl;

public abstract class Command {
    protected ZooImpl zoo;

    public Command() {
    }

    public Command(ZooImpl zoo) {
        this.zoo = zoo;
    }

    public abstract void executeCommand(String[] tokens);
}

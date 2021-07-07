package classes.main.primitives;

public enum CarState {
    IN_DRIVE("inDrive"), PARKED("parked");

    private final String name;

    CarState(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

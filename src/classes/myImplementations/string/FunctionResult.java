package classes.myImplementations.string;

public class FunctionResult {
    private static final String function = "^2 + 2 = ";
    private final int x;
    private final int y;

    public FunctionResult(int x) {
        this.x = x;
        this.y = x * x + 2;
    }

    @Override
    public String toString() {
        return this.x +
                function +
                this.y +
                "\n";
    }
}

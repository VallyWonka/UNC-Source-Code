package classes.myImplementations.string;

import java.util.ArrayList;
import java.util.List;

public class SaveFunctionResults {
    private List<FunctionResult> functionResults = new ArrayList<>();

    public void addPoint(Integer i) {
        this.functionResults.add(new FunctionResult(i));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (FunctionResult result : this.functionResults) {
            stringBuilder.append(result.toString());
        }
        return stringBuilder.toString();
    }
}

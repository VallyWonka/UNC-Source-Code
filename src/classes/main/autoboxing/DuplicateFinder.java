package classes.main.autoboxing;

import java.util.List;

public interface DuplicateFinder<T> {
    List<T> getDuplicatedNumbers(List<T> array);
}

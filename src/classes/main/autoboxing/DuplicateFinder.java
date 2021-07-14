package classes.main.autoboxing;

import java.util.List;

public interface DuplicateFinder<T> {
    List<T> getDuplicatedElements(List<T> array);
}

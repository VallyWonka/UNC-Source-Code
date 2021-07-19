package classes.main.autoboxing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinderImpl<T> implements DuplicateFinder<T> {
    @Override
    public List<T> getDuplicatedElements(List<T> array) {
        Set<T> result= new HashSet<>();
        for (T object: array){
            if(array.indexOf(object) != array.lastIndexOf(object)){
                result.add(object);
            }
        }
        return new ArrayList<>(result);
    }
}

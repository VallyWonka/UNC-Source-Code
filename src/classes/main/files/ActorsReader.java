package classes.main.files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ActorsReader {
    List<Actor> readActors(String path) throws IOException;
}

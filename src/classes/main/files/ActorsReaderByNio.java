package classes.main.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ActorsReaderByNio implements ActorsReader{
    @Override
    public List<Actor> readActors(String path) throws IOException { ;
        Path pathObject = Paths.get(path);

        BufferedReader reader = Files.newBufferedReader(pathObject);
        return reader.lines().map(line -> {
            String[] splitLine = line.split(",");
            return new Actor(splitLine[0].trim(), splitLine[1].trim());
        }).collect(Collectors.toList());
    }
}

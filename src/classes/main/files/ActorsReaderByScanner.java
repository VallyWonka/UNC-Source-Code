package classes.main.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ActorsReaderByScanner implements ActorsReader{
    @Override
    public List<Actor> readActors(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(path));
        scanner.useDelimiter("[,\n]");

        List<Actor> result = new ArrayList<>() ;
        while (scanner.hasNextLine()){
            String name = scanner.next().trim();
            String lastName = scanner.next().trim();
            result.add(new Actor(name, lastName));
        }
        return result;
    }
}

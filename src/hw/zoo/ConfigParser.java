package hw.zoo;

import hw.zoo.model.AnimalFactory;
import hw.zoo.model.CageImpl;
import hw.zoo.model.Species;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConfigParser {

    public static Map<Integer, CageImpl> readZooConfig(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(path));
        scanner.useDelimiter("[,\n]");

        Map<Integer, CageImpl> cageHashMap = new HashMap<>();
        while (scanner.hasNextLine()) {
            Integer number = Integer.parseInt(scanner.next().trim());
            Species species = AnimalFactory.checkSpecies(scanner.next().trim());
            Double area = Double.parseDouble(scanner.next().trim());
            Integer capacity = Integer.parseInt(scanner.next().trim());
            cageHashMap.put(number, new CageImpl(species, area, capacity));
        }
        scanner.close();
        return cageHashMap;
    }

}

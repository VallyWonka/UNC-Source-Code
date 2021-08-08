package hw.zoo;

import hw.zoo.model.AnimalFactory;
import hw.zoo.model.CageImpl;
import hw.zoo.model.Species;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZooBuilder {
    private String configPath = "C:\\Users\\Я\\Documents\\Computer Science\\Java\\UNC-Source-Code\\resources\\cages.txt";
    private String delimiter = "[,\n]";
    private Scanner scanner;

    public ZooBuilder() {
    }

    public ZooBuilder(String path, String delimiter) {
        this.configPath = path;
        this.delimiter = delimiter;
    }

    private void setScanner() throws FileNotFoundException {
        this.scanner = new Scanner(new FileInputStream(this.configPath));
        this.scanner.useDelimiter(this.delimiter);
    }

    public Map<Integer, CageImpl> readCageConfig() {
        Map<Integer, CageImpl> cageHashMap = new HashMap<>();

        try {
            this.setScanner();
        } catch (FileNotFoundException e) {
            return cageHashMap;
        }

        while (this.scanner.hasNextLine()) {
            Integer number = Integer.parseInt(scanner.next().trim());
            Species species = AnimalFactory.checkSpecies(scanner.next().trim());
            Double area = Double.parseDouble(scanner.next().trim());
            Integer capacity = Integer.parseInt(scanner.next().trim());
            cageHashMap.put(number, new CageImpl(species, area, capacity));
        }
        this.scanner.close();
        return cageHashMap;
    }

}

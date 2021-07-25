package classes.main.files;

import java.io.IOException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        ActorsReader reader = new ActorsReaderByBufferedReader();
        try {
            //FileSystemWalker walker = new FileSystemWalker();
            //walker.printFileTree("C:\\Users\\vlan0416\\Desktop\\Computer\\materials\\NC school\\practises\\UNC-Source-Code\\src");
            //"..\\..\\..\\resources\\users.txt"


            StringBuilder stringBuilder = new StringBuilder();
            Formatter formatter = new Formatter(stringBuilder);
            formatter.format("Hello, %s !!!!", "World");

            System.out.println(stringBuilder);


            reader.readActors("C:\\Users\\vlan0416\\Desktop\\Computer\\materials\\NC school\\practises\\UNC-Source-Code\\resources\\users.txt")
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

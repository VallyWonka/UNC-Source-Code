package classes.main.files;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ActorsReaderByBufferedReader implements ActorsReader{
    @Override
    public List<Actor> readActors(String path) throws IOException {
        List<Actor> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                new FileInputStream(path), StandardCharsets.UTF_8)
            )){


            String curLine;

            while ((curLine = reader.readLine()) != null) {
                String[] splitLine = curLine.split(",");
                result.add(new Actor(splitLine[0].trim(), splitLine[1].trim()));
            }

        } catch (FileNotFoundException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}

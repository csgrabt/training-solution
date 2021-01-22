package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFinder {

    public int searchCorona(String word, String filename) {
        int counter = 0;
        Path path = Path.of(filename);

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;

            while ((line = bf.readLine()) != null) {

                if (line.contains(word)) {
                    counter++;
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }


        return counter;
    }


}

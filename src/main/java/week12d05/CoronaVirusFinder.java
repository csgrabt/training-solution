package week12d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFinder {

    public int searchCorona() {
        int counter = 0;
        Path path = Path.of("index.html");

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;

            while ((line = bf.readLine()) != null) {

                if (line.contains("koronavírus")) {
                    counter++;
                }

            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }


        return counter;
    }


    public static void main(String[] args) {
        CoronaVirusFinder cvf = new CoronaVirusFinder();

        System.out.println(cvf.searchCorona());
    }

}

package week07d04.senior;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ShoppingList {


    public long calculateSum(String path) {
        Path path1 = Path.of(path);
        long result = 0L;
        try (BufferedReader bf = Files.newBufferedReader(path1)) {
            String line;

            while ((line = bf.readLine()) != null) {
                String[] array = line.split(";");

                result += (long) Integer.parseInt(array[1]) * Integer.parseInt(array[2]);
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }
        return result;
    }

}

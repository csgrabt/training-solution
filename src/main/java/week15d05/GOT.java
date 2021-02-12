package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GOT {


    public Map<String, Integer> dataReader(String filename) {
        Path path = Path.of(filename);
        Map<String, Integer> result = new HashMap<>();

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            bf.readLine();
            String line;

            while ((line = bf.readLine()) != null) {

                String[] lineArray = line.split(",");

                for (int i = 5; i < 13; i++) {


                    if (!lineArray[i].isEmpty()) {
                        {

                            if (!result.containsKey(lineArray[i])) {
                                result.put(lineArray[i], 0);
                            }
                            int value = result.get(lineArray[i]) + 1;
                            result.put(lineArray[i], value);
                        }

                    }


                }
            }


        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong!", ioe);
        }

        return result;
    }


    public String getMax(Map<String, Integer> map) {
        String house = null;
        int counter = 0;

        for (String item : map.keySet()
        ) {

            if (map.get(item) > counter) {

                counter = map.get(item);
                house = item;
                System.out.println(counter);
            }

        }
        return house;
    }


    public static void main(String[] args) {
        GOT got = new GOT();

        System.out.println(got.getMax(got.dataReader("GOT.csv")));
    }


}

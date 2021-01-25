package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class CitySearcher {

    public String cityCounter(String path) {

        String city = "";


        try (BufferedReader bf = Files.newBufferedReader(Path.of(path))) {

            String line;

            while ((line = bf.readLine()) != null) {


                String irsz = line.substring(line.indexOf(';') + 1);

                String secoundcut = irsz.substring(0, irsz.indexOf(';')).trim();

                if (city.length() < secoundcut.length()) {
                    city = secoundcut;

                }


            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }

        return city;
    }


    public static void main(String[] args) {
        CitySearcher cs = new CitySearcher();


        System.out.println(cs.cityCounter("iranyitoszamok-varosok-2021.csv"));
    }


}

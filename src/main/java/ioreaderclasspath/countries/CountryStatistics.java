package ioreaderclasspath.countries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private List<Country> countries = new ArrayList<>();

    public List<Country> getCountryList() {
        return countries;
    }

    public void readFromFile(String s) {


        try (BufferedReader bf = new BufferedReader((
                new InputStreamReader(CountryStatistics.class.getResourceAsStream("/" + s))
        ))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String[] buffer = line.split(" ");
                countries.add(new Country(buffer[0], Integer.parseInt(buffer[1])));
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }


    }

    public int numberOFCountries() {


        return countries.size();
    }

    public Country mostBorderCountries() {
        int counter = countries.get(0).getBorderCountries();
        int index = 0;

        for (int i = 1; i < countries.size(); i++) {
            if (countries.get(i).getBorderCountries() > counter) {
                index = i;
            }

        }
 return countries.get(index);   }
}
package week08d02.senior;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    public static final String REGEX = " ";
    private final List<Country> countries;

    public CountryStatistics(String filename) {
        this.countries = init(filename);
    }

    public List<Country> getCountries() {
        List<Country> copy = new ArrayList<>();

        for (Country item : countries
        ) {
            copy.add(new Country(item));

        }

        return copy;
    }

    private List<Country> init(String filename) {
        List<Country> countriesFromFile = new ArrayList<>();


        try (BufferedReader bf = new BufferedReader(new FileReader(filename, StandardCharsets.UTF_8))) {
            String line;
            while ((line = bf.readLine()) != null) {
                countriesFromFile.add(createCountry(line));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("File not found!", ioe);
        }
        return countriesFromFile;
    }

    private Country createCountry(String line) {
        String[] item = line.split(REGEX);
        return new Country(item[0], Long.parseLong(item[1]), item[3]);
    }


    public Country maxPopulation() {
        Country highestPopulation = new Country(countries.get(0));

        for (Country item : countries
        ) {
            if (item.getPopulation() > highestPopulation.getPopulation()) {
                highestPopulation = item;
            }
        }
        return highestPopulation;
    }

}

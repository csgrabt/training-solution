package ioreaderclasspath.countries;

public class Country {
    private String name;
    private int borderCountries;


    public Country(String name, int borderCountries) {
        this.name = name;
        this.borderCountries = borderCountries;
    }

    public int getBorderCountries() {
        return borderCountries;
    }

    public String getName() {
        return name;
    }
}

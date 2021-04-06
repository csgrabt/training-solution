package week08d02.senior;

public class Country {
    private String name;
    private long population;
    private String numberOfColorInTheFlag;

    public Country(String name, long population, String numberOfColorInTheFlag) {
        this.name = name;
        this.population = population;
        this.numberOfColorInTheFlag = numberOfColorInTheFlag;
    }


    public Country(Country country) {
        this.name = country.name;
        this.population = country.population;
        this.numberOfColorInTheFlag = country.numberOfColorInTheFlag;
    }


    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public String getNumberOfColorInTheFlag() {
        return numberOfColorInTheFlag;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", numberOfColorInTheFlag='" + numberOfColorInTheFlag + '\'' +
                '}';
    }
}

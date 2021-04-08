package week08d02.senior;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    CountryStatistics countryStatistics = new CountryStatistics("countries.txt");

    @Test
    void constructor() {
        assertEquals(11, countryStatistics.getCountries().size());
    }


    @Test
    void maxPopulation() {
        assertEquals("Kongoi_Demokratikus_Koztarsasag", countryStatistics.maxPopulation().getName());
    }
}
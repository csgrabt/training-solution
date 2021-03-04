package closingproject.businesslogiclayer.language;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LanguageConfigurationTest {

    @Test
    void get1HUN() {
        LanguageConfiguration l = new LanguageConfiguration("/HUN.txt");

    assertEquals("alma", l.getTest());

    }


    @Test
    void get1ENG() {
        LanguageConfiguration l = new LanguageConfiguration("/eng.txt");

        assertEquals("apple", l.getTest());

    }
}
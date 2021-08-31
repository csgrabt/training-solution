package hackearRannk;

import org.junit.jupiter.api.Test;

import static hackearRannk.DaysOfTheWeek.findDay;
import static hackearRannk.DaysOfTheWeek.isLeapYear;
import static org.junit.jupiter.api.Assertions.*;

class DaysOfTheWeekTest {

    @Test
    void findDayTest() {
        assertEquals("MONDAY",findDay(8, 30, 2021));
        assertEquals("MONDAY",findDay(1, 4, 2117));
    }

    @Test
    void isLeapYearTest() {
        assertTrue(isLeapYear(2000));
        assertTrue(isLeapYear(2004));
        assertFalse(isLeapYear(2100));
        assertTrue(isLeapYear(2400));

    }
}
package week07d03.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date = Date.of(2000, 10, 15);

    @Test
    void getYear() {
        assertEquals(2000, date.getYear());
    }

    @Test
    void getMonth() {
        assertEquals(10, date.getMonth());
    }

    @Test
    void getDay() {
        assertEquals(15, date.getDay());
    }


    @Test
    void withYear() {

        assertEquals(2015, date.withYear(2015).getYear());

    }

    @Test
    void withMonth() {

    assertEquals(11, date.withMonth(11).getMonth());

    }

    @Test
    void withDay() {
        assertEquals(30, date.withDay(30).getDay());
    }
}
package week07d04.junior;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    Lab lab = new Lab("translate");

    @Test
    void constructorTestWithTitle() {
        assertEquals("nincs kész", lab.getComplete().toString());
        assertEquals("translate", lab.getTitle());
        assertNull(lab.getCompletedAt());
    }


    @Test
    void constructorTestWithAllData() {


        Lab lab = new Lab("translate", LocalDateTime.of(2015, Month.APRIL, 29, 19, 30, 0));
        assertEquals("kész", lab.getComplete().toString());
    }

    @Test
    void completeNow() {
        lab.completed();

        assertEquals(0, ChronoUnit.SECONDS.between(LocalDateTime.now(), lab.getCompletedAt()));

    }

    @Test
    void completeAt() {
        lab.completed(LocalDateTime.of(2020, 2, 3, 15, 15));

        assertEquals("kész", lab.getComplete().toString());

    }


}
package week06d05.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottleTest {
    Bottle bottle = new Bottle(BottleType.GLASS_BOTTLE, 0);

    @Test
    void getBottleType() {
        assertEquals("GLASS_BOTTLE", bottle.getBottleType().toString());
    }

    @Test
    void getFilledUntil() {
        assertEquals(0, bottle.getFilledUntil());
    }

    @Test
    void fill() {
        bottle.fill(100);
        assertEquals(100, bottle.getFilledUntil());
    }

    @Test
    void of() {

        assertEquals(BottleType.GLASS_BOTTLE, Bottle.of(BottleType.GLASS_BOTTLE).getBottleType());
    }


    @Test
    void fillMoreThanVol() {

        IllegalArgumentException exp = assertThrows(IllegalArgumentException.class, () ->
                bottle.fill(5000));


        assertEquals("There is no enough space in the Bottle!", exp.getMessage());
    }

    @Test
    void bottleIsFull() {
        bottle.fill(1000);
        IllegalArgumentException exp = assertThrows(IllegalArgumentException.class, () ->
                bottle.fill(1000));
        assertEquals("The bottle is full!", exp.getMessage());
    }
}
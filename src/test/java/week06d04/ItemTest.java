package week06d04;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void priceIsNotValid() {
        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Item(-10, 5, "Alma"));

    assertEquals("Price is not valid!", ioe.getMessage());

    }

    @Test
    void monthIsNegative() {
        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Item(10, -5, "Alma"));

        assertEquals("Date is not valid!", ioe.getMessage());
    }

    @Test
    void monthIsHigherThan12() {
        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Item(10, 13, "Alma"));

        assertEquals("Date is not valid!", ioe.getMessage());
    }
}
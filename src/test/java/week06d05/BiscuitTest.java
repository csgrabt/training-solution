package week06d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiscuitTest {
    Biscuit biscuit = new Biscuit(BiscuitType.KRÉKER, 150);


    @Test
    void getType() {
        assertEquals("KRÉKER", biscuit.getType().toString());
    }

    @Test
    void getGramAmount() {
        assertEquals(150, biscuit.getGramAmount());
    }

    @Test
    void of() {

        assertEquals(100, Biscuit.of(BiscuitType.KRÉKER, 100).getGramAmount());

    }

    @Test
    void biscuitAmountLessThanZero() {

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                new Biscuit(BiscuitType.OREO, -150));

        assertEquals("Amount is less than Zero!", ex.getMessage());
    }

    @Test
    void biscuitTypeIsNull() {
        IllegalArgumentException exp = assertThrows(IllegalArgumentException.class, () ->
                new Biscuit(null, 50));
        assertEquals("Type cannot be null!", exp.getMessage());
    }


    @Test
    void toStringTest() {
        assertEquals("Type: KRÉKER, amount: 150 gr", biscuit.toString());
    }


}

package gyakorlas.multicath;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class TrainerParserTest {

    @Test
    void testNull() {
        TrainerParser trainerParser = new TrainerParser();
        Exception exception = assertThrows(ParserException.class, () -> {
            trainerParser.parse(null);
        });
        assertEquals("invalid line: null", exception.getMessage());
        assertTrue(exception.getCause() instanceof NullPointerException);
    }


    @Test
    void testInvalid() {
        TrainerParser trainerParser = new TrainerParser();
        Exception exception = assertThrows(ParserException.class, () -> {
            trainerParser.parse("");
        });
        assertEquals("invalid line: ", exception.getMessage());
        assertTrue(exception.getCause() instanceof IndexOutOfBoundsException);

    }


    @Test
    void testInvalidNumber() {
        TrainerParser trainerParser = new TrainerParser();
        Exception exception = assertThrows(ParserException.class, () -> {
            trainerParser.parse("John Doe; abc");
        });
        assertEquals("invalid line: John Doe; abc", exception.getMessage());
        assertTrue(exception.getCause() instanceof NumberFormatException);

    }


    @Test
    void testValid() {

        Trainer trainer = new TrainerParser().parse("John Doe;30");


        assertEquals(30, trainer.getAge());
        assertEquals("John Doe", trainer.getName());
    }

}












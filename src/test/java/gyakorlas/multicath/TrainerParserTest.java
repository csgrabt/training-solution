package gyakorlas.multicath;

import org.junit.jupiter.api.Test;
import week10d05.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class TrainerParserTest {

    @Test
    void testNull() {
 TrainerParser trainerParser = new TrainerParser();
Exception exception = assertThrows(ParserException.class, () -> {
    trainerParser.parse(null);
});
        assertEquals("invalid line: null",exception.getMessage());
        assertTrue(exception.getCause() instanceof NullPointerException);
    }


    @Test
    void testInvalid() {
        TrainerParser trainerParser = new TrainerParser();
        Exception exception = assertThrows(ParserException.class, () -> {
            trainerParser.parse("");
        });
        assertEquals("invalid line: ",exception.getMessage());
    assertTrue(exception.getCause() instanceof IndexOutOfBoundsException );

    }


    @Test
    void testInvalidNumber() {
        TrainerParser trainerParser = new TrainerParser();
        Exception exception = assertThrows(ParserException.class, () -> {
            trainerParser.parse("John Doe; abc");
        });
        assertEquals("invalid line: John Doe; abc",exception.getMessage());
        assertTrue(exception.getCause() instanceof NumberFormatException);

    }


    @Test
    void testValid() {

        Trainer trainer = new TrainerParser().parse("John Doe;30");


        assertEquals(30,trainer.getAge());
        assertEquals("John Doe",trainer.getName());
    }

}




 //  @Test
 //  void findMinSum4() {
 //      int[] b = new int[3];
 //      b[0] = 2;
 //      b[1] = 1;
 //      b[2] = -3;


 //      Exception actualException = assertThrows(IllegalArgumentException.class, () -> {
 //          Calculator.findMinSum(b);

 //      });
 //      assertEquals("A 3 méretű tömbben található számok átlaga: 0.0", actualException.getMessage());







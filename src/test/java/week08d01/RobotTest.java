package week08d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {
    Robot robot = new Robot();

    @Test
    void moveStringIsEmpty() {

        assertEquals("y= 0\nx= 0", robot.move(""));
    }

    @Test
    void moveStringIsNull() {

        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class, () ->
                robot.move(null));

        assertEquals("String is null!", ioe.getMessage());
    }

    @Test
    void moveStringHasInvalidChar() {

        IllegalArgumentException ioe = assertThrows(IllegalArgumentException.class, () ->
                robot.move("LLLLLA"));

        assertEquals("The step is invalid!", ioe.getMessage());
    }



    @Test
    void moveStringIsL() {

        assertEquals("y= -1\nx= 0", robot.move("L"));
    }

    @Test
    void moveStringIsF() {

        assertEquals("y= 1\nx= 0", robot.move("F"));
    }

    @Test
    void moveStringIsJ() {

        assertEquals("y= 0\nx= 1", robot.move("j"));
    }

    @Test
    void moveStringIsB() {

        assertEquals("y= 0\nx= -1", robot.move("b"));
    }

    @Test
    void moveStringIsComplex() {

        assertEquals("y= 0\nx= 0", robot.move("JjBbLlFf"));
    }

}
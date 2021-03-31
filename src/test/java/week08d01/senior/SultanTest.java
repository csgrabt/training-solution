package week08d01.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SultanTest {
    Sultan sultan = new Sultan(100);

    @BeforeEach
    void setUp() {
        sultan.doorOpener();
    }

    @Test
    void doorOpener() {

    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[1].getState());
    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[2].getState());
    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[4].getState());
    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[6].getState());
    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[10].getState());
    assertEquals(StateOfTheDoor.CLOSE, sultan.getPrison()[96].getState());

    }

    @Test
    void whichCellIsOpen() {
        assertEquals(10, sultan.whichCellIsOpen().get(StateOfTheDoor.OPEN.toString()).size());
    }

    @Test
    void cellStateCounter() {
    assertEquals(90, sultan.cellStateCounter().get(StateOfTheDoor.CLOSE));

    }
}
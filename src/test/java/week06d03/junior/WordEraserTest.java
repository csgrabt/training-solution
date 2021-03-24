package week06d03.junior;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class WordEraserTest {
    WordEraser wordEraser = new WordEraser();

    @Test
    void wordEraser() {
        assertEquals("körte birsalma", wordEraser.eraseWord("alma körte alma birsalma", "alma"));
    }


}
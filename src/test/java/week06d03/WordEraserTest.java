package week06d03;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordEraserTest {

    @Test
    public void wordEraser() {
        WordEraser wordEraser = new WordEraser();

          assertEquals("körte birsalma", wordEraser.eraseWord("alma körte alma birsalma", "alma"));


    }






}
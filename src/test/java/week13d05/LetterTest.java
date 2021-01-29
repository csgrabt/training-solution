package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void letterCounter() {
        Letter letter = new Letter(97, 122);


        assertEquals(2, letter.letterCounter("ab"));


    }


    @Test
    void letterCounterWithComa() {
        Letter letter = new Letter(97, 122);


        assertEquals(0, letter.letterCounter("áé"));

    }

    @Test
    void letterCounterWithNumber() {
        Letter letter = new Letter(97, 122);


        assertEquals(1, letter.letterCounter("aa12"));

    }


    @Test
    void letterCounterWithOtherCharacter() {
        Letter letter = new Letter(97, 122);


        assertEquals(1, letter.letterCounter("aá1:_, !%/*-+ \n 123456789"));

    }

}
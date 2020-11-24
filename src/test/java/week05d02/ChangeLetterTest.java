package week05d02;

import employee.Employee;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ChangeLetterTest {

    @Test
    public void changeStringTest() {
ChangeLetter changeLetter = new ChangeLetter();
        assertEquals("*lm*", changeLetter.changeVowels("alma"));
        assertEquals("*lm*", changeLetter.changeVowels("ALMA"));
        assertEquals("****", changeLetter.changeVowels("eioa"));

        assertEquals("LKBMFRTZHJKC".toLowerCase(), changeLetter.changeVowels("LKBMFRTZHJKC"));
    }


    @Test
    public void stringIsNull() throws IllegalArgumentException {
        ChangeLetter changeLetter = new ChangeLetter();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> changeLetter.changeVowels(null));
        assertEquals("String is null!", ex.getMessage());
    }

    @Test
    public void stringIsEmpty() throws IllegalArgumentException {
        ChangeLetter changeLetter = new ChangeLetter();
        Exception ex = assertThrows(IllegalArgumentException.class, () -> changeLetter.changeVowels(""));
        assertEquals("String is Empty!", ex.getMessage());
    }



}
package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    void wordsWithChar() {

    WordFilter wf = new WordFilter();

        List<String> string = List.of("Alma", "Béla", "Vacsora", "Kicsim");;



        assertEquals(2, wf.wordsWithChar(string, 'l').size());


    }
}
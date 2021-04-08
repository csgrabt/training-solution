package week08d03.senior;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringList2Test {
    StringList2 stringList2 = new StringList2();

    @Test
    void shortestWords() {
        List<String> test = List.of("aaa", "aa", "bb", "cccc", "dd");
        assertEquals(3, stringList2.shortestWords(test).size());

    }
}
package week08d03.junior;

import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week08d03.junior.StringLists.stringListsUnion;

class StringListsTest {


    @Test
    void getNumbersTest() {
        List<String> list1 = List.of("a", "b", "c", "d");
        List<String> list2 = List.of("a", "b", "c", "d", "e");


        assertEquals("[a, b, c, d, e]", stringListsUnion(list1, list2).toString());

    }


}
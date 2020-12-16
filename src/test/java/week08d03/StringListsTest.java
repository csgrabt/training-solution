package week08d03;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static week08d03.StringLists.stringListsUnion;

public class StringListsTest {


    @Test
    public void getnumbersTest() {
List<String> list1 = new ArrayList<>();
list1.add("a");
list1.add("b");
list1.add("c");
list1.add("d");
List<String> list2 = new ArrayList<>();
list2.add("a");
list2.add("b");
list2.add("c");
list2.add("d");
list2.add("e");

        assertEquals("[a, b, c, d, e]", stringListsUnion(list1, list2).toString());

    }


}
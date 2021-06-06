package week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week06d01.junior.ListSelector;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ListSelectorTest {
    ListSelector listSelector = new ListSelector();
    List<String> list = new ArrayList<>();

    @Test
    void listIsNull() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> listSelector.listSelector(null));
        assertEquals("List is null!", ex.getMessage());
    }

    @Test
    void listIsEmpty() {
        list = new ArrayList<>();
        assertEquals("", listSelector.listSelector(list));
    }


    @Test
    void listIsNotEmpty() {
        list.add("kálium");
        list.add("hidrogén");
        list.add("nitrogén");
        list.add("glicerin");
        list.add("alma");

        assertEquals("[kálium,nitrogén,alma]", listSelector.listSelector(list));
    }

}

package week06d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import week05d05.User;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListSelectorTest {

    @Test

    public void listIsNull() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ListSelector lS = new ListSelector();
            List<String> list = new ArrayList<>();
            list = null;
            lS.listSelector(list);});
        assertEquals("List is null!", ex.getMessage());
    }

    @Test
    public void listIsEmpty() {

            ListSelector lS = new ListSelector();
            List<String> list = new ArrayList<>();
            assertEquals("", lS.listSelector(list));
    }


    @Test
    public void listIsnotEmpty() {

        ListSelector lS = new ListSelector();
        List<String> list = new ArrayList<>();
        list.add("kálium");
        list.add("hidrogén");
        list.add("nitrogén");
        list.add("glicerin");
        list.add("alma");


        assertEquals("[kálium,nitrogén,alma]", lS.listSelector(list));
    }

}

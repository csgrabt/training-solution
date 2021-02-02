package gyakorlas2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class IntegerOperationTest {

    @Test

    void testAutoboxing(){
        List<Integer> l = new ArrayList<>();
        Integer i = new Integer(5);

        l.add(i);
        l.add(5);

       int f = l.get(0);

       assertEquals(5, f);

    }

@Test
    void testMap(){

    Map<Character, Integer> m = new HashMap<>();

    //



}



}

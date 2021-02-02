package gyakorlas2;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


public class MapTest {

    @Test

    void testMap(){
        Map<String, String> codes = new HashMap<>();

        assertTrue(codes.isEmpty());

        codes.put("200", "OK");
        codes.put("404", "Not found");
        System.out.println(codes.toString());

        Map<String, String> expected = new HashMap<>();
        expected.put("200", "OK");
        expected.put("404", "Not found");

        assertTrue(codes.equals(expected));
        assertEquals(codes, expected);

        codes.put("404", "Not Found");

        System.out.println(codes);

        System.out.println(codes.get("404"));


        codes.put("304", "Not Modified");

        System.out.println(codes);

        codes.remove("404");

        assertFalse(codes.containsKey("404"));


        for (Map.Entry item:codes.entrySet()
             ) {
            System.out.println(item.getKey());
            System.out.println(item.getValue());

        }




        codes.clear();

        assertTrue(codes.isEmpty());



    }
}

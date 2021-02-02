package gyakorlas2;

import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {


    @Test

    void SetTest(){
        Set<Trainer> s = new HashSet<>();

       s.add(new Trainer("Jack"));
       s.add(new Trainer("Jack"));
      assertEquals(1, s.size() );

    }

    @Test

    void SetTestOrder(){
        Set<Trainer> s = new LinkedHashSet<>();

        s.add(new Trainer("Jane"));
        s.add(new Trainer("Jack"));
        System.out.println(s);
        for (Trainer item:s
             ) {
            System.out.println(item.getName());

        }

    }

}
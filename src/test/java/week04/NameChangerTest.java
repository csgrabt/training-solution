package week04;

import org.junit.jupiter.api.Test;
import week04d01.NameChanger;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {
    @Test
 public void testConstuctor(){
       IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()-> new NameChanger(""));
assertEquals("FullName is null!", iae.getMessage());
    }
@Test
    public void changeNameTest(){
        NameChanger nameChanger = new NameChanger( "AAA BBB");
        nameChanger.changeFirstname("CCC");
        assertEquals("AAA CCC", nameChanger.getFullName());

}

}
package introjunit;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GentlemanTest {

@Test
public void testCreateGentleman(){
    //Given

    Gentleman gentleman = new Gentleman("Jhon");

    //When
    String name = gentleman.getName();


    //Then
    assertEquals("Jhon", name);

}


    @Test
    void sayHello() {
 //Given
 Gentleman gentleman = new Gentleman("Jack");

 //When
        String name = gentleman.getName();

        //Then
        assertEquals("Hello Jack", gentleman.sayHello(name));

}
}

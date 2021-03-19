package week05d05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void productTest() {
        User user = new User("Liszt", "Béla", "alma@alma.hu");


        assertEquals("Liszt", user.getFirstName());
        assertEquals("Béla", user.getLastName());
        assertEquals("Liszt Béla", user.getFullName());}



    @Test



       public void productTestEmailat() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
               new User("Liszt", "Béla", "almaalma.hu");
           });
           assertEquals("no @", ex.getMessage());
    }

    @Test

    public void productTestEmaildot() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new User("Liszt", "Béla", "alma@almahu");
        });
        assertEquals("no .", ex.getMessage());
    }




}


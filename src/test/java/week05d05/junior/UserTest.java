package week05d05.junior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    @Test
    void productTest() {
        User user = new User("Liszt", "Béla", "alma@alma.hu");
        assertEquals("Liszt", user.getFirstName());
        assertEquals("Béla", user.getLastName());
        assertEquals("Liszt Béla", user.getFullName());
    }


    @Test
    void emailNotContainsAt() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("Liszt", "Béla", "almaalma.hu")
        );
        assertEquals("Email address does not contain \"@\"", ex.getMessage());
    }

    @Test
    void emailNotContainsDot() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new User("Liszt", "Béla", "alma@almahu")
        );
        assertEquals("Email address does not contain \".\"", ex.getMessage());
    }


}


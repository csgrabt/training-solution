package week07d02.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserImlTest {
    User user = User.of("csgkadt", "Alma", "Béla");

    @Test
    void getUsername() {

        assertEquals("csgkadt", user.getUsername());
    }

    @Test
    void getFirstName() {
        assertEquals("Alma", user.getFirstName());

    }

    @Test
    void getLastName() {
        assertEquals("Béla", user.getLastName());
    }

    @Test
    void getFullName() {
        assertEquals("Alma Béla", user.getFullName());
    }

}
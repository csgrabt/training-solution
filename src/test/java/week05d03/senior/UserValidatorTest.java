package week05d03.senior;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {
    UserValidator us = new UserValidator();

    @Test
    void listIsnull() {
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(null));
        assertEquals("List is null!", iae.getMessage());
    }


    @Test
    void userIsNull() {


        List<User> testList = new ArrayList<>();
        testList.add(null);

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(testList));
        assertEquals("User is null!", iae.getMessage());

    }


    @Test
    void ageIsLowerThanOne() {
        List<User> testList = new ArrayList<>();
        testList.add(new User("John Doe", -50));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(testList));
        assertEquals("Age is not valid!", iae.getMessage());

    }

    @Test
    void ageIsHigherThan120() {
        List<User> testList = new ArrayList<>();
        testList.add(new User("John Doe", 151));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(testList));
        assertEquals("Age is not valid!", iae.getMessage());

    }

    @Test
    void nameIsEmpty() {
        List<User> testList = new ArrayList<>();
        testList.add(new User("", 5));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(testList));
        assertEquals("Name is not valid!", iae.getMessage());
    }

    @Test
    void nameIsNull() {
        List<User> testList = new ArrayList<>();
        testList.add(new User(null, 5));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> us.validate(testList));
        assertEquals("Name is not valid!", iae.getMessage());
    }


}


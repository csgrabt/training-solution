package closingproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CitizenTest {

    @Test
    void constructorTest() {
        Citizen citizen = new Citizen(
                "Árvíztűrő Tükörfúrógép",
                "5400",
                53,
                "m@m",
                "123456788");
        assertEquals("Árvíztűrő Tükörfúrógép", citizen.getFullName());
        assertEquals("5400", citizen.getZipCode());
        assertEquals(53, citizen.getAge());
        assertEquals("m@m", citizen.getEmail());
        assertEquals("123456788", citizen.getHealthInsuranceNumber());
    }

    @Test
    void nameTest() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    null,
                    "5400",
                    53,
                    "m@m",
                    "123456788");
        });
        assertEquals("Name can not be null!", ex.getMessage());

    }
    @Test
    void ageTest() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    3,
                    "m@m",
                    "123456788");
        });
        assertEquals("Age is not correct!", ex.getMessage());

    }

    @Test
    void eamilTestNoAt() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    30,
                    "mmm",
                    "123456788");
        });
        assertEquals("Email address is not valid!", ex.getMessage());

    }
    @Test
    void eamilTestShort() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    30,
                    "m@",
                    "123456788");
        });
        assertEquals("Email address is not valid!", ex.getMessage());

    }


    @Test
    void healthInsuranceTestNotNumber() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    30,
                    "m@",
                    "a12345678");
        });
        assertEquals("One of the Character is not number!", ex.getMessage());

    }

    @Test
    void healthInsuranceTestLength() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    30,
                    "m@",
                    "2345678");
        });
        assertEquals("The length of the insurance number is wrong!", ex.getMessage());

    }

    @Test
    void healthInsuranceTestNotCorrect() {
        Exception ex = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Citizen(
                    "Kiss Béla",
                    "5400",
                    30,
                    "m@",
                    "023456708");
        });
        assertEquals("Health insurance number is wrong!", ex.getMessage());

    }




}
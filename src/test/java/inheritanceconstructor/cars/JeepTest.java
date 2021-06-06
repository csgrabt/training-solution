package inheritanceconstructor.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JeepTest {


    @Test
    public void incorrectParameterShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new Jeep(10.0, 60.0, 50.0, 40.0, 20.0));
        assertEquals("Tank capacity is less than fuel!", ex.getMessage());
    }


    @Test
    public void modifyFuelAmount1() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 100.0, 40.0, 20.0);
        //When
        jeep.modifyFuelAmount(50);
        //Then
        assertEquals(80.0, jeep.getFuel());

    }

    @Test
    public void modifyFuelAmount2() {
        //Given
        Jeep jeep = new Jeep(10.0, 30.0, 100.0, 40.0, 20.0);
        //When
        jeep.modifyFuelAmount(90);
        //Then
        assertEquals(100.0, jeep.getFuel());
        assertEquals(40, jeep.getExtraFuel());
    }


}

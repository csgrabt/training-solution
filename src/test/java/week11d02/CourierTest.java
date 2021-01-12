package week11d02;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void addRide() {
        List<Ride> rides = new ArrayList<>();
        rides.add(new Ride(1, 1, 1));
        rides.add(new Ride(1, 2, 1));
        rides.add(new Ride(3, 1, 1));

    Courier courier = new Courier(rides);

    assertEquals(3, courier.getRides().size());


    }


    @Test
    void addRideError() {
        List<Ride> rides = new ArrayList<>();
        Courier courier = new Courier(rides);

        courier.addRide(new Ride(1, 2, 1));
        courier.addRide(new Ride(1, 1, 1));
        courier.addRide(new Ride(3, 1, 1));

        assertEquals(1, courier.getRides().size());








    }



    @Test
    void freeDay() {
    }
}
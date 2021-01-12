package week11d02;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CourierTest {

    @Test
    void addRideIsNull() {
        Courier courier = new Courier(List.of(new Ride(1, 1, 1)));
        Exception actualException = assertThrows(IllegalArgumentException.class, () -> {
            courier.addRide(null);
        });
        assertEquals("Ride is null", actualException.getMessage());

    }

    @Test
    void addFirstRide() {
        List<Ride> list = new ArrayList<>();
        Courier courier = new Courier(list);
        Ride ride = new Ride(1, 1, 1);
        courier.addRide(ride);
        assertEquals(1, courier.getRides().size());
    }


    @Test
    void addFirstRideError() {
        List<Ride> list = new ArrayList<>();
        Courier courier = new Courier(list);
        Ride ride = new Ride(1, 2, 1);
        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            courier.addRide(ride);
        });
        assertEquals("Nem a nap első köre", ex.getMessage());
    }


    @Test
    void freeDay() {
        Courier courier = new Courier(List.of(new Ride(1, 1, 1),
                new Ride(1, 2, 3),
                new Ride(3, 1, 1)
        ));


        assertEquals(2, courier.freeDay());


    }

    @Test
    void addRideDayIsDifferent() {
        List<Ride> list = new ArrayList<>();
        Courier courier = new Courier(list);
        Ride ride = new Ride(1, 1, 1);
        courier.addRide(ride);
        Ride ride2 = new Ride(2, 1, 1);
        courier.addRide(ride2);
        assertEquals(2, courier.getRides().size());
    }

    @Test
    void addRideDayIsSame() {
        List<Ride> list = new ArrayList<>();
        Courier courier = new Courier(list);
        Ride ride = new Ride(1, 1, 1);
        courier.addRide(ride);
        Ride ride2 = new Ride(1, 2, 1);
        courier.addRide(ride2);
        assertEquals(2, courier.getRides().size());
    }


    @Test
    void addRideDayInNotOrder() {
        List<Ride> list = new ArrayList<>();
        Courier courier = new Courier(list);
        Ride ride = new Ride(1, 1, 1);
        courier.addRide(ride);
        Ride ride2 = new Ride(3, 2, 1);

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
        courier.addRide(ride2);
        });
    assertEquals("A ride példány nem illeszthető a sorba!", ex.getMessage());

    }


}
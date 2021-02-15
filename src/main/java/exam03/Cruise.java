package exam03;

import java.time.LocalDate;
import java.util.*;

public class Cruise {
    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers = new ArrayList<>();

    public Boat getBoat() {
        return boat;
    }

    public LocalDate getSailing() {
        return sailing;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if (boat.getMaxPassengers() <= passengers.size()) {
            throw new IllegalArgumentException("A hajó megtelt");
        }
        passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {

        return passenger.getCruiseClass().getMultiply() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        Passenger passenger = null;

        for (Passenger item : passengers
        ) {
            if (item.getName().equals(name)) {

                passenger = item;
                return passenger;
            }

        }


        throw new IllegalArgumentException("Nincs ilyen utas");
    }


    public List<String> getPassengerNamesOrdered() {
        List<String> result = new ArrayList<>();


        for (Passenger item : passengers
        ) {
            result.add(item.getName());

        }

        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return result;
    }

    public double sumAllBookingsCharged() {
        double result = 0;

        for (Passenger item : passengers
        ) {
            result += getPriceForPassenger(item);

        }


        return result;
    }


    public Map<CruiseClass, Integer> countPassengerByClass() {

        Map<CruiseClass, Integer> result = new HashMap<>();


        for (Passenger item : passengers
        )
            fillTheMap(result, item);


        return result;
    }

    private void fillTheMap(Map<CruiseClass, Integer> result, Passenger item) {
        if (!result.containsKey(item.getCruiseClass())) {
            result.put(item.getCruiseClass(), 0);
        }
        result.put(item.getCruiseClass(), result.get(item.getCruiseClass()) + 1);
    }


}

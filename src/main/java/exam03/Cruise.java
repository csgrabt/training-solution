package exam03;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

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

        return passengers.stream()
                .map(Passenger::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public double sumAllBookingsCharged() {
        return passengers.stream()
                .mapToDouble(n -> n.getCruiseClass().getMultiply() * basicPrice)
                .sum();

    }


    public Map<CruiseClass, Integer> countPassengerByClass() {

        return passengers.stream()
                .collect(Collectors.toMap(Passenger::getCruiseClass, n -> 1, Integer::sum));
    }


}

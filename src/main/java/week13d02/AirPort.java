package week13d02;

import statements.Time.Time;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class AirPort {

    private List<Flight> f;

    public AirPort(String string) {

        List<Flight> flights = new ArrayList<>();

        Path path = Path.of(string);
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;

            while ((line = bf.readLine()) != null) {
                String[] flight = line.split(" ");

                flights.add(new Flight(
                        flight[0],
                        type(flight),
                        flight[2],
                        timeGenerator(flight)
                ));
            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }

        this.f = flights;
    }


    private Time timeGenerator(String[] string) {
        String time = string[3];
        int hour = Integer.parseInt(time.substring(0, time.indexOf(':')));
        int minute = Integer.parseInt(time.substring(time.indexOf(':') + 1).trim());

        return new Time(hour, minute, 00);
    }

    private Type type(String[] string) {
        if (string[1].equals("Arrival")) {
            return Type.ARRIVAL;
        }


        return Type.DEPARTURE;
    }


    public Type typeCounter() {
        int numberOfFlights = f.size();

        int counter = 0;

        for (Flight item : f
        ) {
            if (item.getType().equals(Type.ARRIVAL)) {
                counter++;
            }


        }

        if (counter > numberOfFlights / 2) {
            return Type.ARRIVAL;
        }
        return Type.DEPARTURE;
    }


    public Flight searchByFlightNumber(String numberOfFlight) {

        for (Flight item : f
        ) {
            if (item.getFlightNumber().equals(numberOfFlight)) {
                return item;
            }
        }


        return new Flight("NaN", Type.NAN, "NaN", new Time(00, 00, 00));
    }


    public List<Flight> searchByCityAndType(String city, Type type) {
        List<Flight> flightsByCity = new ArrayList<>();

        for (Flight item : this.f
        ) {
            if (item.getCity().equals(city) && item.getType().equals(type)) {
                flightsByCity.add(item);
            }

        }


        return flightsByCity;
    }


    public Flight earliest() {
        Time time = new Time(23, 59, 59);

        Flight flight = new Flight("aaa", Type.DEPARTURE, "Nan", time);

        for (Flight item : this.f
        ) {
            if (item.getTime().earlierThan(time) && item.getType().equals(Type.DEPARTURE)) {
                flight = item;
                time = item.getTime();
            }

        }
        return flight;
    }


    public static void main(String[] args) {

        AirPort ap = new AirPort("cities.txt");


        System.out.println(ap.earliest());

    }
}

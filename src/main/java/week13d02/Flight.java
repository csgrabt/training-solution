package week13d02;

import statements.Time;

public class Flight {
private final String flightNumber;
private final Enum type;
private final String city;
private Time time;


    public Flight(String flightNumber, Type type, String city, Time time) {
        this.flightNumber = flightNumber;
        this.type = type;
        this.city = city;
        this.time = time;
    }



    public String getFlightNumber() {
        return flightNumber;
    }

    public Enum getType() {
        return type;
    }

    public String getCity() {
        return city;
    }

    public Time getTime() {
        return time;
    }


    @Override
    public String toString() {
        return   flightNumber + " " + type+ " " + city + " " + time + "\n" ;
    }
}

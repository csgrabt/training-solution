package week11d02;

public class Ride {
private int day;
private int counter;
private int distance;

    public Ride(int day, int counter, int distance) {
        this.day = day;
        this.counter = counter;
        this.distance = distance;
    }


    public int getDay() {
        return day;
    }

    public int getCounter() {
        return counter;
    }

    public int getDistance() {
        return distance;
    }
}

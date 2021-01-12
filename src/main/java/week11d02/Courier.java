package week11d02;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    private List<Ride> rides = new ArrayList<>();


    public Courier(List<Ride> rides) {
        this.rides = rides;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void addRide(Ride ride) {
        if (ride == null) {
            throw new IllegalArgumentException("Ride is null");
        }
        if (rides.isEmpty()) {
            if (ride.getCounter() == 1) {
                rides.add(ride);
                return;
            } else {
                throw new IllegalArgumentException("Nem a nap első köre");
            }
        }
        int lastDay = rides.get(rides.size() - 1).getDay();
        int lastCounter = rides.get(rides.size() - 1).getDay();

        int newDay = ride.getDay();
        int newCounter = ride.getCounter();

        if (lastDay < newDay && newCounter == 1) {
            rides.add(ride);
            return;
        }
        if (lastDay == newDay && lastCounter + 1 == newCounter) {
            rides.add(ride);
            return;
        }

        throw new IllegalArgumentException("A ride példány nem illeszthető a sorba!");

    }


    public int freeDay() {
        int counter = 0;

        for (int i = 1; i < 8; i++) {
            for (Ride item : rides
            ) {
                if (i == item.getDay()) {
                    counter++;


                }

            }
            if (counter == 0) {
                return i;
            }
            counter = 0;
        }


        return -1;
    }


}




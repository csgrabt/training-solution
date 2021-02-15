package reinstall.rental;

import java.time.LocalDateTime;
import java.util.*;

public class CanoeOffice {

    private List<CanoeRental> canoeRentalList = new ArrayList<>();

    public void createRental(CanoeRental canon) {
        canoeRentalList.add(canon);

    }

    public CanoeRental findRentalByName(String name) {
        CanoeRental canoeRental = null;
        for (CanoeRental item : canoeRentalList
        ) {
            if (item.isActive() && item.getName().equals(name)) {
                canoeRental = item;
            }


        }
        return canoeRental;
    }


    public void closeRentalByName(String name, LocalDateTime endTime) {

        for (CanoeRental item : canoeRentalList
        ) {
            if (item.getName().equals(name)) {
                item.setEndTime(endTime);
            }

        }
    }


    public double getRentalPriceByName(String name, LocalDateTime endTime) {

        CanoeRental cr = null;
        for (CanoeRental item : canoeRentalList
        ) {
            if (item.getName().equals(name)) {
                item.setEndTime(endTime);
                cr = item;
            }


        }
        return cr.calculateRentalSum(cr.getEndTime());
    }

    public List<CanoeRental> listClosedRentals() {
        List<CanoeRental> result = new ArrayList<>();

        for (CanoeRental item : canoeRentalList
        ) {
            if (!item.isActive()) {
                result.add(item);
            }

        }


        Collections.sort(result, new Comparator<CanoeRental>() {
            @Override
            public int compare(CanoeRental o1, CanoeRental o2) {
                return o1.getStartTime().compareTo(o2.getStartTime());
            }
        });
        return result;
    }


    public Map<CanoeType, Integer> countRentals() {

        Map<CanoeType, Integer> result = new HashMap<>();

        for (CanoeRental item : canoeRentalList
        ) {
            if (!item.isActive()) {
                if (result.containsKey(item.getCanoeType())) {
                    result.put(item.getCanoeType(), 0);
                } else {
                    result.put(item.getCanoeType(), result.get(item.getCanoeType()) + 1);
                }
            }

        }


        return result;
    }


}





package week15d01;


import java.util.Map;

public class SearchMaximum {


    public Coordinate searchMaximum(Map<Double, Double> coordinates) {
        if (coordinates.isEmpty()) {
            throw new IllegalArgumentException("Map is Empty!");
        }

        double x = Double.MIN_VALUE;
        double y = Double.MIN_VALUE;


        for (Double item : coordinates.keySet()
        ) {
            if (coordinates.get(item) > y) {
                x = item;
                y = coordinates.get(item);
            }

        }


        return new Coordinate(x, y);
    }


}

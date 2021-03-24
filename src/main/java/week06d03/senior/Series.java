package week06d03.senior;

import java.util.List;

public class Series {

    public TypeOfSeries calculateSeriesType(List<Integer> list) {
        validator(list);
        int monotony = calculateTheMonotony(list);
        if (monotony == list.size() - 1) {
            return TypeOfSeries.INCREASING;
        }
        if (monotony == 0) {
            return TypeOfSeries.DECREASING;
        }

        return TypeOfSeries.RANDOM;
    }


    private int calculateTheMonotony(List<Integer> list) {
        int result = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) - list.get(i) < 0) {
                result++;
            }
        }
        return result;
    }

    private void validator(List<Integer> list) {

        if (list == null || list.size() < 2) {
            throw new IllegalArgumentException("List is not valid!");
        }
    }

}


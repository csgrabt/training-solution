package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> integers) {
        int maxNumber = 0;
        for (Integer n: integers
             ) { if (n > maxNumber){maxNumber = n;}
        }
    return maxNumber;
    }
}

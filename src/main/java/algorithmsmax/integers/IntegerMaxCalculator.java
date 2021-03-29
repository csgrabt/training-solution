package algorithmsmax.integers;

import java.util.List;

public class IntegerMaxCalculator {

    public int max(List<Integer> integers) {
        if(integers== null || integers.isEmpty()){
           throw new IllegalArgumentException("List is empty or null!");
       }
        int maxNumber = integers.get(0);
        for (Integer n: integers
             ) { if (n > maxNumber){maxNumber = n;}
        }
    return maxNumber;
    }
}

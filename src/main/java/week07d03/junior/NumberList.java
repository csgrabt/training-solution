package week07d03.junior;

import java.util.List;

public class NumberList {


    public static boolean isIncreasing(List<Integer> list) {

        for (int i = 1; i < list.size(); i++) {
            int a = list.get(i) - list.get(i - 1);
            if (a < 0) {
                return false;
            }
        }

        return true;
    }


}

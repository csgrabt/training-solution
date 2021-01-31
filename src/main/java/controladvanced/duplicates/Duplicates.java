package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {

    public List<Integer> findDuplicates(List<Integer> integerList) {
        List<Integer> duplicates = new ArrayList<>();


        for (Integer number : integerList
        ) {
            if (!(duplicates.contains(number))) {
                duplicates.add(number);
            }

        }


        return duplicates;
    }


}

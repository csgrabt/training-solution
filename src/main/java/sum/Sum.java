package sum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Van egy Listánk, egész számokkal feltöltve, ezt, és egy másik számot átadjuk egy metódusnak, és az a kérdés, hogy
 * a listában van e két olyan szám, aminek az összege a paraméterként átadott szám
 **/
public class Sum {
    /**
     * az első megoldásban többször kell bejárni a listát, ami lassú célszerú olyan metódust írni, ami csak egyszer
     * járja be a listát
     **/

    public boolean sum(List<Integer> values, int sum) {
        for (int i = 0; i < values.size(); i++) {
            for (int b = i+1; b < values.size(); b++) {
                if (values.get(i) + values.get(b) == sum) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean sum2(List<Integer> values, int sum) {
        Set<Integer> complement = new HashSet<>();

        for (Integer item : values
        ) {
            if (complement.contains(item)) {
                return true;
            } else {
                complement.add(sum - item);
            }
        }
        return false;
    }
}

package week08d03.senior;

import java.util.ArrayList;
import java.util.List;

public class StringList2 {

    public List<String> shortestWords(List<String> words) {
        List<String> result = new ArrayList<>();
        int minimumLength = minLength(words);
        for (String item : words
        ) {
            if (item.length() == minimumLength) {
                result.add(item);
            }
        }
        return result;

    }

    private int minLength(List<String> words) {
        int result = Integer.MAX_VALUE;
        for (String item : words
        ) {
            if (item.length() < result) {
                result = item.length();
            }

        }

        return result;
    }
}

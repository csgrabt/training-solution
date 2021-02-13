package cheetsheat;

import java.util.HashMap;
import java.util.Map;

public class CountingByMap {

    public static void main(String[] args) {
        String s = "alma mater";
        Map<Character, Integer> countOfLetters = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (countOfLetters.containsKey(c)) {
                countOfLetters.put(c, countOfLetters.get(c) + 1);
            }
            else {
                countOfLetters.put(c, 1);
            }
        }
        System.out.println(countOfLetters); // { =1, a=3, r=1, t=1, e=1, l=1, m=2}
        int numberOfM = countOfLetters.get('m'); // 2
    }
}

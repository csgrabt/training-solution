package week14d01;

import java.util.*;

public class Indexer {
    public Map<Character, List<String>> index(List<String> names) {
        if (validator(names)) {
            throw new IllegalArgumentException("List is emty or null");
        }
        Map<Character, List<String>> result = new HashMap<>();
        List<String> value;
        for (String item : names) {
            char key = item.toCharArray()[0];
            if (result.containsKey(key)) {
                value = result.get(key);
                value.add(item);
                result.replace(key, value);
            } else {
                value = new ArrayList<>();
                value.add(item);
                result.put(key, value);
            }
        }
        return result;
    }

    private boolean validator(List<String> names) {
        return names.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(new Indexer().index(Arrays.asList("Béla", "Géza", "Géza", "Géla", "Ferenc", "Béza", "Lujza", "Ludmilla", "Abraham", "Adam", "Ajtony", "Magdolna")));
        ;


    }
}

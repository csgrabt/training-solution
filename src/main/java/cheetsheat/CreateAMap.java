package cheetsheat;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreateAMap {
    public static void main(String[] args) {


        Map<String, String> words = new HashMap<>();
        words.put("apple", "alma");
        words.put("peer", "körte");

        System.out.println(words.get("apple")); // alma

        words.put("apple", "Apfel"); // Felülírja az értéket
        System.out.println(words.get("apple")); // Apfel

        Set<String> keys = words.keySet(); // Kulcsok
        Collection<String> values = words.values(); // Értékek

        for (Map.Entry entry: words.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }




    }
}

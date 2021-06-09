package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("Java");
        list.add("Python");
        list.add("JavaScript");


        for (String item : list) {
            if (item.length() > 5) {
                System.out.println(item);
            }
        }

        list.stream()
                .filter(n -> n.length() > 5)
                .forEach(System.out::println);


    }


}

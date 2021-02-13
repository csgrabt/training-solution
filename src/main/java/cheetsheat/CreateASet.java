package cheetsheat;

import java.util.HashSet;
import java.util.Set;

public class CreateASet {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("Jack");
        names.add("John");
        System.out.println(names); // [John, Jack]

        names.remove("John");

        boolean contains = names.contains("Jack"); // true

        for (String name : names) {
            System.out.println(name);
        }


    }
}

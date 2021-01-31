package controladvanced.duplicates;

import java.util.List;

public class DuplicateMain {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,8,8,8,8,8,8,8,9,10,10,00,11,11);


        Duplicates duplicates = new Duplicates();


        System.out.println(duplicates.findDuplicates(list));


    }
}

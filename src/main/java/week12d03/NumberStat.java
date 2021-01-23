package week12d03;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberStat {


    public int numberCounter(List<Integer> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("List is empty!");
        }
        int counter = 0;

        List<Integer> list2 = new ArrayList<>(list);

        Collections.sort(list2);

        System.out.println(list2.toString());

        for (int i = 0; i < list2.size(); i++) {
            for (Integer number : list
            ) {
                if (number == list2.get(i)) {
                    counter++;
                }

            }
            if (counter == 1) {
                return list2.get(i);
            } else {
                counter = 0;
            }
        }


        return counter;
    }


    private List<Integer> listSorter(List<Integer> list) {
        Collections.sort(list);
        return list;
    }


    public static void main(String[] args) {

        NumberStat ns = new NumberStat();

        List<Integer> list = List.of(1, 1, 5, 3, 4, 5, 6, 5, 6, 4, 1, 6, 5, 4);




        System.out.println(ns.numberCounter(list));


    }

}

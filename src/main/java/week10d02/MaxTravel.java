package week10d02;

import java.util.ArrayList;
import java.util.List;

public class MaxTravel {

    public final int NUMBER_OF_BUS_STATION = 30;


    public List<Integer> makeTheList(List<Integer> list) {

        isBlanck(list);

        List<Integer> numberOfNewPassenger = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < NUMBER_OF_BUS_STATION; i++) {
            for (Integer number : list
            ) {
                if (number == i) {
                    counter++;
                }
            }
            numberOfNewPassenger.add(counter);
            counter = 0;
        }
        return numberOfNewPassenger;
    }


    public int maxOfList(List<Integer> list) {

        int maxValue = list.get(0);
        for (int n : list
        ) {
            if (n > maxValue) {
                maxValue = n;
            }

        }

        return maxValue;
    }


    public List<Integer> indexOfMaximums(List<Integer> list, int number) {

        List<Integer> listOfIndexOfMaximum = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
            if (list.get(i) == number) {
                listOfIndexOfMaximum.add(i);
            }

        return listOfIndexOfMaximum;
    }


    public List<Integer> getMaxIndex(List<Integer> list) {

        List modList = makeTheList(list);
        int maxValue = maxOfList(modList);
        return indexOfMaximums(modList, maxValue);
    }


    private void isBlanck(List list){
        if (list == null){throw  new IllegalArgumentException("List is null!");}
        if (list.isEmpty()){throw new IllegalArgumentException("List is Empty!");}
    }


}
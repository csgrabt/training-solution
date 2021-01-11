package week11d01;

import java.util.ArrayList;
import java.util.List;

public class DivisorFinder {


    public int findDivisors(int i) {

        int counter = 0;

        String number = Integer.toString(i);

        List<Integer> numberList= new ArrayList<>();

        for(int n = 1; n < number.length(); n++){

            int irma = Integer.parseInt(number.substring(n, n+1));

             if (irma != 0){
                 numberList.add(irma);
             }

        }

        for (Integer listNumber:numberList
             ) { if (i%listNumber == 0){
                 counter++;
        }

        }




        return counter;
    }




    }



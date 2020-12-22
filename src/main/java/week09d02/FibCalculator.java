package week09d02;

import java.util.ArrayList;
import java.util.List;

public class FibCalculator {





    public static long sumEvens(int bound){
        long fibNumberLast;

        List<Long> fibNumbers = new ArrayList<>();

        firstTwoFibNumbersAddToList(fibNumbers);

        List<Long> evenFibNumbers = new ArrayList<>();


      do {

           fibNumberLast = fibNumbers.get(fibNumbers.size()-2) + fibNumbers.get(fibNumbers.size()-1);

           fibNumbers.add(fibNumberLast);

          if (fibNumberLast % 2 == 0){
              evenFibNumbers.add(fibNumberLast);}


        }   while (fibNumberLast <= bound);



    return  listLastNumberHigherAsBound(evenFibNumbers, bound);}



private static long sum(List<Long> list){
long sum = 0;
    for (Long n :list
         ) { sum +=n;
    }


return sum;}


private static void firstTwoFibNumbersAddToList(List<Long> list){
    list.add(0L);
    list.add(1L);
}

    private static long listLastNumberHigherAsBound(List<Long> list, int bound){
        Long sum = sum(list);
        if (list.get(list.size()-1)>bound){
            sum = sum(list)-list.get(list.size()-1);}
        return sum;}



}
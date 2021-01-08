package week10d05;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Calculator {

    public static double findMinSum(int[] arr) {
      if (arr == null){throw new IllegalArgumentException("Array is null!");}

      List<Integer> numbers = makeAList(arr);

      if (arr.length < 4){throw new IllegalArgumentException("A " + arr.length + " méretű tömbben található számok átlaga: " + averageCalculator(numbers));}

      Collections.sort(numbers);

      return averageCalculator(numbers);


    }



public static List<Integer> makeAList(int[] arr){
        List<Integer> numbers = new ArrayList<>();

    for (Integer number: arr
         ) {numbers.add(number);

    }

     return numbers;
}

private static double sumCalculator(List<Integer> list){

        double sum = 0.0;

      if (list.size() < 4) {
          for (Integer number: list
               ) {
              sum += number;
          }
      } else { for
      (int i = 0; i < 4; i++){
      sum += list.get(i);}
      }

   return sum;}



private static double averageCalculator(List<Integer> list){

       if (list.size() < 3){return sumCalculator(list)/list.size();}


       return sumCalculator(list)/4;}







}




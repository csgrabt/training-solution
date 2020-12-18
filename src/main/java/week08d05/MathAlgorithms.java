package week08d05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MathAlgorithms {

private static void isZero(int number1, int number2){
    if (number1 ==0 || number2 ==0 ){throw  new IllegalArgumentException("Cannot be divided by zero");}


}

    private static List<Integer> sort(int number1, int number2){
        List<Integer> shorted = new ArrayList<>();
        shorted.add(Math.abs(number1));
        shorted.add(Math.abs(number2));
        Collections.sort(shorted);

        return shorted;}

    public static int greatestCommonDivisor(int number1, int number2){
    isZero(number1, number2);
    List<Integer> list = sort(number1, number2);
        for (int i = list.get(0); i > 1; i-- ){
            if (list.get(1)% i == 0 && list.get(0)%i == 0){
                return i;}
        }

        return 1;}




}

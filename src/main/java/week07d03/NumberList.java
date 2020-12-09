package week07d03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberList {


public static boolean  isIncreasing(List<Integer> list){

    for(int i =1; i<list.size(); i++){
        int a = list.get(i)-list.get(i-1);
        if (a < 0){return false;}
    }


    return  true;
}

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,3,5,7,9,10, 15);

        System.out.println(isIncreasing(intList));
    }

}

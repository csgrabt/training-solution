package week07d01;

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    protected static List<Integer> knownPrim = new ArrayList<>();


public static void fullList(){

    knownPrim.add(2);
    knownPrim.add(3);
    knownPrim.add(5);
    knownPrim.add(7);
    //feltölteném egy fájlból az ismert prímekkel egy fájlból
}




   public static  boolean  isPrime(int x){
    if (x <1){throw new IllegalArgumentException("Invalid number!");}
    if (x == 1){return false;}
    if (knownPrim.isEmpty()){fullList();}

    for (Integer n:knownPrim) {
        if (n == x){return true;
        }else
            {
                if (x % n == 0)
                {return false;}
            }
    }
    for (int i = 2; i <=x/2; i++ ){
                if (x % i == 0 )
                {return false;}
        }


       MathAlgorithms.knownPrim.add(x); //a listát itt kimenteném egy adat fájlba,


return true;}



}



package week05d03.junior;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {



    public static final char searchedCharacter = 'a';
    public static final int indexOfChar = 0;

public int counterAa(List<String> list){
   int count = 0;
   for (int i = 0; i < list.size(); i++){
       if (list.get(i).toLowerCase().charAt(indexOfChar) == searchedCharacter){count++;}
   }
    return count;}

    }
















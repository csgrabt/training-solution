package week05d03;

import java.util.ArrayList;
import java.util.List;

public class ListCounter {

private List<String> nameList = new ArrayList<>();

    public ListCounter(List<String> nameList) {
        this.nameList = nameList;
    }


    public List<String> getNameList() {
        return nameList;
    }

    public static final char searchedCharacter = 'a';
    public static final int indexOfChar = 0;

public int counterAa(){
   int count = 0;
   for (int i = 0; i < nameList.size(); i++){
       if (nameList.get(i).toLowerCase().charAt(indexOfChar) == searchedCharacter){count++;}
   }
    return count;}

    }
















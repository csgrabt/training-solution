package week08d03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StringLists {

public static List<String> stringListsUnion(List<String> first, List<String> second){
 List<String> union = new ArrayList<>(first);
 for (String string:second
         ) { if (!(union.contains(string))){
             union.add(string);
    }

    }

    Collections.sort(union);


 return union;}

}

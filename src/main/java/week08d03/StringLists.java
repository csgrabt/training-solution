package week08d03;

import java.util.List;

public class StringLists {

public static List<String> stringListsUnion(List<String> first, List<String> second){
    for (String string:second
         ) { if (!(first.contains(string))){
             first.add(string);
    }

    }


return first;}

}

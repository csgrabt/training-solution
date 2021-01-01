package catalog;

import java.util.List;

public class Validators {

public static boolean isBlank(String string){
    if (string == null) {
    return true;}
        return string.isBlank();
    }


public static boolean isEmpty(List list){
if (list == null)
{return true;}
return list.isEmpty(); }

}

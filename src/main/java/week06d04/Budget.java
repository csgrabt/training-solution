package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private List<Item> items = new ArrayList<>();


    public Budget(List<Item> items) {
        this.items = items;
    }


public List getItemsByMonth(int month){
        List<Item> list = new ArrayList<>();
       for (int i = 0; i < items.size(); i++){
           if (items.get(i).getMonth() == month){
               list.add(items.get(i));
           }


       }


    return list;        }


}










package week06d04.junior;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private final List<Item> items;


    public Budget(List<Item> items) {
        this.items = items;
    }


    public List<Item> getItemsByMonth(int month) {
        List<Item> list = new ArrayList<>();
        for (Item item : items) {
            if (item.getMonth() == month) {
                list.add(item);
            }
        }
        return list;
    }


}










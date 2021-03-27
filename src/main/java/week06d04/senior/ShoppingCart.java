package week06d04.senior;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();


    public List<Item> getItems() {
        return items;
    }


    public void addItem(String name, int quantity) {


        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new Item(name, quantity));


    }


    public int getItem(String name) {
        for (Item item : items
        ) {
            if (item.getName().equals(name)) {
                return item.getQuantity();
            }

        }
        return 0;
    }


}

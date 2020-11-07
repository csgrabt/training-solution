package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {
    private String name;
    private int capacity;
    private List<String> menu;

    public Restaurant(String name, int numberOfTable, List<String> menu){
        this.name = name;
        this.capacity = numberOfTable*4;
        this.menu = addmenu();
    }
//Scanner scanner = new Scanner(System.in);



public List<String> addmenu(){
        return Arrays.asList("Hal", "Macska", "Tengeri uborka", "Kutyabecsinált");

};


    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<String> getMenu() {
        return menu;
    }
}

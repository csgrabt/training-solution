package introconstructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant("Alma", 25, Arrays.asList());






        System.out.println(restaurant.getMenu());
        System.out.println(restaurant.getCapacity());



    }


}

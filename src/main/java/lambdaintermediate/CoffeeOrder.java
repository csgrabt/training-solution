package lambdaintermediate;

import java.time.LocalDateTime;
import java.util.List;

public class CoffeeOrder {

    public List<Coffee> coffeeList;
    private LocalDateTime localDateTime;


    public CoffeeOrder(List<Coffee> coffeeList, LocalDateTime localDateTime) {
        this.coffeeList = coffeeList;
        this.localDateTime = localDateTime;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}

package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Cafe {
    List<CoffeeOrder> coffeeOrders;

    public Cafe(List<CoffeeOrder> coffeeOrders) {
        this.coffeeOrders = coffeeOrders;
    }

    public BigDecimal getTotalIncome() {
        return coffeeOrders.stream()
                .flatMap(n -> n.getCoffeeList().stream())
                .map(Coffee::getPrice)
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);


    }

    public BigDecimal getTotalIncome(LocalDate localDate) {
        return coffeeOrders.stream()
                .filter(n -> n.getLocalDateTime().toLocalDate().equals(localDate))
                .flatMap(n -> n.getCoffeeList().stream())
                .map(Coffee::getPrice)
                .reduce(BigDecimal.ZERO, (a, b) -> a.add(b), (x, y) -> x.add(y)).setScale(2, RoundingMode.HALF_UP);


    }


    public long getNumberOfCoffee(CoffeeType type) {
        return coffeeOrders.stream()
                .flatMap(n -> n.getCoffeeList().stream())
                .map(Coffee::getType)
                .filter(n -> n.equals(type))
                .count();
    }

    public Collection<CoffeeOrder> getOrdersAfter(LocalDateTime dateTime) {
        return coffeeOrders.stream()
                .filter(n -> n.getLocalDateTime().isAfter(dateTime))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate localDate) {

        return coffeeOrders.stream()
                .filter(n -> n.getLocalDateTime().toLocalDate().isEqual(localDate))
                .sorted((a, b) -> a.getLocalDateTime().compareTo(b.getDateTime()))
                .limit(5)
                .collect(Collectors.toList());

    }
}




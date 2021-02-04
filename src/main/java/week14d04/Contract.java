package week14d04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Contract {

    private String name;
    private List<Integer> monthlyPrices;


    public Contract(String name, List<Integer> monthlyPrices) {
        this.name = name;
        this.monthlyPrices = monthlyPrices;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMonthlyPrices() {
        return monthlyPrices;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "name='" + name + '\'' +
                ", monthlyPrices=" + monthlyPrices +
                '}';
    }
}


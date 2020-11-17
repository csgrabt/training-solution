package algorithmssum;

import java.util.ArrayList;
import java.util.List;

public class SalesAmountSumCalculator {
    //private List<Salesperson> list = new ArrayList();

    public int sumSalesAmount(List<Salesperson> salesperson) {
int a = 0;
        for (Salesperson n : salesperson
             ) { a += n.getAmount();

        }

        return a;
    }
}


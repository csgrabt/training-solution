package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson salesPersonBelow = new Salesperson(" ", 0, 0);

        for (Salesperson salesperson : salespersons) {
            if (
                    salesperson.getAmount() > salesPersonBelow.getAmount()) {
                salesPersonBelow = salesperson;
            }
        }


        return salesPersonBelow;
    }
}

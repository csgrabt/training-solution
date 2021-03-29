package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestBelowTargetSelector {
    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> salespersons) {
        Salesperson salesPersonBelow = new Salesperson(" ", 0, 0);

        for (Salesperson salesperson : salespersons) {
            if (
                    salesperson.getDifferenceFromTarget() < salesPersonBelow.getDifferenceFromTarget()) {
                salesPersonBelow = salesperson;
            }
        }


        return salesPersonBelow;
    }
}

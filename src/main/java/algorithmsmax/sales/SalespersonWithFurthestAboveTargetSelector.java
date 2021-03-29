package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson salespersonbelow = new Salesperson(" ", 0, 0);

        for (Salesperson salesperson : salespersons) {
            if (
                    salesperson.getDifferenceFromTarget() > salespersonbelow.getDifferenceFromTarget()) {
                salespersonbelow = salesperson;
            }
        }


        return salespersonbelow;
    }
}

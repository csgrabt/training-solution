package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {
    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> salespersons) {
        Salesperson salespersonbelow = new Salesperson(" ", 0,  0);
        int a = salespersons.size();
        for (int i = 0; i < a; i++){if (
                salespersons.get(i).getDifferenceFromTarget() > salespersonbelow.getDifferenceFromTarget()){salespersonbelow = salespersons.get(i);}
        }



        return salespersonbelow;}
}

package algorithmsmax.sales;

import java.util.List;

public class SalesAmountMaxSelector {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> salespersons) {
        Salesperson salespersonbelow = new Salesperson(" ", 0,  0);
        int a = salespersons.size();
        for (int i = 0; i < a; i++){if (
                salespersons.get(i).getAmount() > salespersonbelow.getAmount()){salespersonbelow = salespersons.get(i);}
        }



        return salespersonbelow;}
}

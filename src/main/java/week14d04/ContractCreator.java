package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private List<Contract> contracts;


    public ContractCreator(String client, List<Integer> monthlyPrices) {
        contracts.add(new Contract(client, monthlyPrices));
    }

    public void create(String name) {
        List<Integer> listOfCopy = new ArrayList<>();

        for (Integer item : contracts.get(0).getMonthlyPrices()
        ) {
            listOfCopy.add(item);

        }


        contracts.add(new Contract(name, listOfCopy));


    }

}

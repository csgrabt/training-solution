package week14d04;

import java.util.ArrayList;
import java.util.List;

public class ContractCreator {

    private Contract contract;


    public ContractCreator(String client, List<Integer> monthlyPrices) {
        contract = (new Contract(client, monthlyPrices));
    }

    public Contract getContract() {
        return contract;
    }

    public Contract create(String name) {
        List<Integer> listOfCopy = new ArrayList<>();

        for (Integer item : contract.getMonthlyPrices()
        ) {
            listOfCopy.add(item);

        }


        return new Contract(name, listOfCopy);


    }

    @Override
    public String toString() {
        return "ContractCreator{" +
                "contract=" + contract +
                '}';
    }

    public static void main(String[] args) {
        ContractCreator template = new ContractCreator("Peter", List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1));

Contract contract2 = template.create("béla");
Contract contract3 = template.create("Doe");


        System.out.println(template);
        System.out.println(contract2);


        contract2.getMonthlyPrices().add(11, 50);

        System.out.println(template);
        System.out.println(contract2);
        System.out.println(contract3);


    }


}

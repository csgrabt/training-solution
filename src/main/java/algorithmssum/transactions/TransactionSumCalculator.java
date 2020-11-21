package algorithmssum.transactions;

import java.util.List;

public class TransactionSumCalculator {










    public int sumAmountOfCreditEntries(List<Transaction> transactions) {
        int d = 0;
        int a = transactions.size();
        for (int i = 0; i < a; i++){

        if (transactions.get(i).isCredit()){d += transactions.get(i).getAmount();}}



        return d;

    }
}

package algorithmscount.bankaccounts;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccounts, int i) {
        int a = 0;
        for (BankAccount b: bankAccounts) { if ( i < b.getBalance())
            { a++;}
        }


  return a;
    }
}


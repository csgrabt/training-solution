package exceptionclass.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();


    public Bank(List<Account> accounts) {
        if (accounts==null){throw new IllegalArgumentException();}
        this.accounts = accounts;
    }

    public void payment(String accountNumber, double amount) {
     if (accountNumber==null){throw new IllegalArgumentException();}
int counter = 0;
        for (Account account:accounts
             ) {if(account.getAccountNumber().equals(accountNumber)){
                 account.subtract(amount);
                 counter++;
             }

        }

if (counter == 0){throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);}

    }

    public void deposit(String accountNumber, double amount) {
int counter = 0;
        for (Account account:accounts
        ) {if(account.getAccountNumber().equals(accountNumber)){
            account.deposit(amount);
            counter++;
        }

        }
if (counter==0){throw new InvalidBankOperationException(ErrorCode.INVALID_ACCOUNTNUMBER);}
    }
}

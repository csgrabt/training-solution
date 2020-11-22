package algorithmsdecision.bankaccounts;

public class BankAccount {
private String nameOfOwner;
private String accountNumber;
private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }


    public boolean withdraw(int i) {
int c = balance;
if (balance > i ){
balance = balance - i;}

    return c > i;}


    public boolean deposit(int i) {
        int oldBalance = balance;
        balance = balance + i;


        return balance == oldBalance + i;
    }
}

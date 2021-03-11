package classstructureintegrate.bank;

import java.util.Scanner;


public class Bank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a Bankszámla Számot!");
        String number1 = scanner.nextLine();
        System.out.println("Adja meg a nevét!");
        String name1 = scanner.nextLine();
        System.out.println("Adja meg az egyenlegét!");
        int balance1 = scanner.nextInt();

        scanner.nextLine();


        BankAccount acc1 = new BankAccount(number1, name1, balance1);

        System.out.println(acc1.getInfo());

// második ügyfél
        System.out.println("Adja meg a Bankszámla Számot!");
        String number2 = scanner.nextLine();
        System.out.println("Adja meg a nevét!");
        String name2 = scanner.nextLine();
        System.out.println("Adja meg az egyenlegét!");
        int balance2 = scanner.nextInt();

        BankAccount acc2 = new BankAccount(number2, name2, balance2);

        System.out.println(acc1.getInfo());
        System.out.println(acc2.getInfo());


        System.out.println("Mennyi pénzt szeretne kivenni?");
        acc1.withdraw(scanner.nextInt());
        System.out.println(acc1.getInfo());

        System.out.println("Mennyi pénzt szeretne betenni?");
        acc2.deposit(scanner.nextInt());
        System.out.println(acc2.getInfo());

        System.out.println("Mennyi pénzt utalna?");
        acc1.transfer(acc2, scanner.nextInt());


        System.out.println(acc1.getInfo());
        System.out.println(acc2.getInfo());


    }

}
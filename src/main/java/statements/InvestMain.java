package statements;

import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Befektetett összeg: ");
        int amount = scanner.nextInt();
        System.out.println("Kamatláb: ");
        int kamat = scanner.nextInt();

        Investment investment = new Investment(amount, kamat);

investment.print();

    }
}

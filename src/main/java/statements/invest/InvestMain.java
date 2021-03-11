package statements.invest;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InvestMain {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Befektetett összeg: ");
            int amount = scanner.nextInt();
            System.out.println("Kamatláb: ");

            double interestRare = scanner.nextDouble();


            Investment investment = new Investment(amount, interestRare);

            investment.print();
        } catch (InputMismatchException ie) {
            throw new IllegalArgumentException("Hibás adatbevitel!", ie);
        }
    }
}

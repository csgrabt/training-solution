package classstructureio;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Adj meg két egész számot kérlek:");

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();

        int number2 = scanner.nextInt();

        System.out.println( number1 + "+" + number2);

        System.out.println( number1 + number2);
    }
}

package classstructureio;
/*
Készíts egy Calculator osztályt a classstructureio csomagba!
A main metódusban kérj be a felhasználótól két egész számot!
Az első sorban írd ki a műveletet a következő formátumban: 5 + 10!
A második sorban írd ki az eredményt (15)!
*/
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

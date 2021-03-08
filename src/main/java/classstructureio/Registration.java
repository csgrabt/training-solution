package classstructureio;
/*A main metódusban kérd be a felhasználótól a nevét és az email címét,
majd írd ki, hogy milyen adatokkal regisztrált!
*/
import java.util.Scanner;


public class Registration {
    public static void main(String[] args) {
        System.out.println("Adja meg a nevét és az email címét:");
        Scanner scanner= new Scanner(System.in);
        String name = scanner.nextLine();


        String email = scanner.nextLine();

        System.out.println("Neve: " + name);
        System.out.println("Email címe: " + email);
    }






}

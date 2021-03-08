package classstructureattributes;
import java.util.Scanner;

/*Hozz létre egy main() metódust a ClientMain osztályba, amelyben kipróbálod a Client osztály működését.
Példányosítani kell egy objektumot a Client osztály alapján, majd kérd be az attribútumok értékét a felhasználótól.
Ellenőrzésképp írd ki minden attribútumának értékét a konzolra!
*/


public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("Adja meg a nevét, címét, és születési idejét:");
        Scanner scanner= new Scanner(System.in);
        client.name = scanner.nextLine();
        client.address = scanner.nextLine();
        client.year = scanner.nextInt();

        System.out.println("A megadott adatok: " + client.name  + ", " + client.address + ", " + client.year );








    }




}

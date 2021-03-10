package classstructureattributes;
import java.util.Scanner;




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

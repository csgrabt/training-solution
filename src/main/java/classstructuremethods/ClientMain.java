package classstructuremethods;

import java.util.Scanner;

public class  ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.setName("Bélafalvi Béla");
        client.setYear(1984);
        client.setAddress("Bélapátfalva");
        System.out.println(client.getAddress());
        System.out.println(client.getYear());
        System.out.println(client.getName());
        System.out.println("Adja meg az új címét");
        Scanner scanner= new Scanner(System.in);
        String newAddress = scanner.nextLine();

        client.migrate(newAddress);

        System.out.println("Új cím " + client.getAddress());


    }
}

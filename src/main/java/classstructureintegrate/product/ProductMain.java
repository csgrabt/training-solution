package classstructureintegrate.product;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {


        System.out.println("Adja meg a temék nevét");

       Scanner scanner = new Scanner(System.in);

       String name = scanner.nextLine();
        System.out.println("Adja meg a termék árát!");
       int price = scanner.nextInt();

       Product product = new Product(name, price);


        System.out.println("Mennyivel szeretnéd emelni az árat?");

        int aremeles = scanner.nextInt();

        product.increasePrice(aremeles);

        System.out.println("A termék emelt ára:" + product.getPrice());



    }

}

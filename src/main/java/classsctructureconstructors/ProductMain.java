package classsctructureconstructors;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mi a termék neve?");
        String name1 = scanner.nextLine();
        System.out.println("Ára?");
        int price1 = scanner.nextInt();


        Product product = new Product(name1, price1);


        System.out.println("A termék neve: " + product.getName() + " A termék ára: " + product.getPrice());

        System.out.println("Mennyive nőtt az ár?");
        product.incrasePrice(scanner.nextInt());
        System.out.println(product.getPrice());

        System.out.println("Mennyive csökken az ára?");
        product.decreasePrice(scanner.nextInt());
        System.out.println(product.getPrice());
    }

}

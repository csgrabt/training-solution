package classstructureconstructors.store;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {
        Store store1 = new Store("tritiomát");
        Store store2 = new Store("tetrationát");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyi anyagot szeretnél beszállítani az 1. raktárba?");
        store1.store(scanner.nextInt());
        System.out.println(store1.getStock());

        System.out.println("Mennyi anyagot szeretnél beszállítani újra az 1. raktárba?");
        store1.store(scanner.nextInt());
        System.out.println(store1.getStock());

        System.out.println("Mennyi anyagot szeretnél elszállítani az 1. raktárból?");
        store1.dispatch(scanner.nextInt());
        System.out.println(store1.getStock());
// 2. raktár
        System.out.println("Mennyi anyagot szeretnél beszállítani az 2. raktárba?");
        store2.store(scanner.nextInt());
        System.out.println(store2.getStock());

        System.out.println("Mennyi anyagot szeretnél beszállítani újra az 2. raktárba?");
        store2.store(scanner.nextInt());
        System.out.println(store2.getStock());

        System.out.println("Mennyi anyagot szeretnél elszállítani az 2. raktárból?");
        store2.dispatch(scanner.nextInt());
        System.out.println(store2.getStock());




    }








}

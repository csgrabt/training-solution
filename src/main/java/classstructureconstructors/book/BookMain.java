package classstructureconstructors.book;

import java.util.Scanner;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Tolkein" , "A király visszatér");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());


        System.out.println("Adja meg a regisztációs számot:");

        Scanner scanner = new Scanner(System.in);

        book.register(scanner.nextLine());

        System.out.println(book.getRegNumber());

    }





}

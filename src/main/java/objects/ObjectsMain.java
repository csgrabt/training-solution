package objects;

import java.util.ArrayList;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {
        Book book = new Book();


        System.out.println(book);

        Book emtyBook = book;

        System.out.println(emtyBook);


        boolean a = book ==emtyBook;

        System.out.println(a);

        Book anotherBook = new Book();

        boolean b = anotherBook == emtyBook;

        System.out.println(anotherBook instanceof Book);

        System.out.println(b);

        Book[] bookTomb = new Book[3];

        bookTomb[0] = book;
        bookTomb[1] = book;
        bookTomb[2] = book;


        List<Book> bookArray = new ArrayList<>();
        bookArray.add(book);
        bookArray.add(book);
        bookArray.add(book);








    }


}

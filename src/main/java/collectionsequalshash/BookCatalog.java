package collectionsequalshash;

import java.util.List;
import java.util.Set;

public class BookCatalog {


    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {

        Book book = new Book(title, author);

        if (books.contains(book)) {
            return book;
        }


        return null;
    }


    public Book findBook(List<Book> books, Book book) {

        if (books.contains(book)) {
        return book;}

        return null;
    }


/*    public Set<Book> addBooksToSet(Book[] books) {
        return null;
    }*/
}

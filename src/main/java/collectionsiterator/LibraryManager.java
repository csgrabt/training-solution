package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }


    public Book findBookByRegNumber(int i) {

        Iterator<Book> g = libraryBooks.iterator();

        while (g.hasNext()) {
            Book c = g.next();

            if (c.getRegNumber() == i) {

                return c;
            }

        }


        throw new MissingBookException("No books found with regnumber: " + i);
    }


    public int removeBookByRegNumber(int i) {
        Iterator<Book> b = libraryBooks.iterator();

        while (b.hasNext()) {
            Book c = b.next();

            if(c.getRegNumber() == i){
                b.remove();
            return i;
            }

        }


        throw new MissingBookException("No books found with regnumber: " + i);
    }


    public int libraryBooksCount() {
        return libraryBooks.size();
    }


    public Set<Book> selectBooksByAuthor(String tolkien) {
        Set<Book> books = new HashSet<>();

        Iterator<Book> g = libraryBooks.iterator();

        while(g.hasNext()){

            Book b = g.next();

            if(b.getAuthor().equals(tolkien)){
                books.add(b);
            }


        }

        if(books.isEmpty()){
            throw new MissingBookException("No books found by Tolkien");
        }


        return books;
    }
}

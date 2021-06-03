package lambdastreams.bookstore;

import java.util.List;

import java.util.Optional;

public class BookStore {

    private List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public int getNumberOfBooks() {
        return books.stream().reduce(0, (a, b) -> a + b.getNumberOfBook(), (a, b) -> a + b);
    }


    public Optional<Book> findNewestBook() {
        return books.stream().max((a, b) -> a.getYearOfPublish() - b.getYearOfPublish());
    }

    public int getTotalValue() {
        return books.stream().reduce(0, (a, b) -> a + b.getPrice() * b.getNumberOfBook(), (x, y) -> x + y);
    }


}

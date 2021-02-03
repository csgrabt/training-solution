package collectionsiterator;

import java.util.Objects;
import java.util.Set;

public class Book {

    private int regNumber;
    private String title;
    private String author;


    public Book(int regNumber, String title, String author) {
        this.regNumber = regNumber;
        this.title = title;
        this.author = author;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getRegNumber() == book.getRegNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRegNumber());
    }








}

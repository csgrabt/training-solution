package collectionsequalshash;

import java.util.Objects;

public class Book {

private String title;
private String author;
private String regNumber;


    public Book(String title, String author, String rehNumber) {
        this.title = title;
        this.author = author;
        this.regNumber = rehNumber;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getRegNumber() {
        return regNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
}

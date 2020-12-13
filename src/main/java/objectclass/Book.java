package objectclass;

import java.util.Objects;

public class Book {
    private String Author;
    private String title;

    public Book(String author, String title) {
        Author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Author='" + Author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(Author, book.Author) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author, title);
    }
}

package sorting;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private String author;



    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;

    }

    public int getId() {
        return id;
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
        return getId() == book.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Book o) {
        return this.id-o.id;
    }


    @Override
    public String toString() {
        return id + " " + author + " " + title ;
    }
}

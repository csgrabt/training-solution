package iofilestest;

public class Book {

    private String author;
    private String title;


    public Book(String name, String title) {

        this.author = name;
        this.title = title;

    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

}

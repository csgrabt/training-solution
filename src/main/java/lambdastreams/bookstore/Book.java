package lambdastreams.bookstore;

public class Book {
    private String title;
    private int YearOfPublish;
    private int price;
    private int numberOfBook;

    public Book(String title, int year, int price, int numberOfBook) {
        this.title = title;
        this.YearOfPublish = year;
        this.price = price;
        this.numberOfBook = numberOfBook;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublish() {
        return YearOfPublish;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfBook() {
        return numberOfBook;
    }
}

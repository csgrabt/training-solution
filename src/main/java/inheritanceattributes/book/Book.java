package inheritanceattributes.book;

public class Book {

private String Title;
protected int price;


    public Book(String title, int price) {
        Title = title;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public int purchase(int pieces){
        return price*pieces;
    }


    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", price=" + price +
                '}';
    }
}

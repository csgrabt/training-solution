package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book ("A bölcsek köve");


        System.out.println(book.getTitle());


        Book book1 = book;


        System.out.println(book.getTitle() + " " + book1.getTitle());

    }





}

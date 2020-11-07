package attributes.Book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book ("A bölcsek köve");


        System.out.println(book.getTitle());


        Book book1 = book;


        System.out.println(book.getTitle() + " " + book1.getTitle());


        book1.setTitle("Alma");


        System.out.println(book.getTitle() + " " + book1.getTitle());

    }






}

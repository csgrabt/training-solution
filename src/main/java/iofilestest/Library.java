package iofilestest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books = new ArrayList<>();


    public void add2(Book book) {

        int counter = 0;

        for (Book boo : books
        ) {
            if (boo.getAuthor().equals(book.getAuthor()) && boo.getTitle().equals(book.getTitle())) {

                counter++;
            }

        }
        if (counter == 0) {
            books.add(book);
        }

    }


    public void saveBooks(Path path) {


        try (BufferedWriter bf = Files.newBufferedWriter(path)) {

            for (int i = 0; i < books.size(); i++) {

                bf.write(books.get(i).getAuthor() + ";" + books.get(i).getTitle() + "\n");
            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }


    }

    public void loadBooks(Path path) {

        try (BufferedReader br = Files.newBufferedReader(path)) {


            String line;

            while ((line = br.readLine()) != null){

                String author = line.substring(0, (line.indexOf(";")));
                String title = line.substring(line.indexOf(";")+1);

               add2(new Book(author, title));

            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }


    }


    public static void main(String[] args) {
        Library library = new Library();

        library.add2(new Book("Tolkein", "A gyűrűk ura"));
        library.add2(new Book("Tolkein", "A gyűrűk ura II."));





        library.loadBooks(Path.of("library.txt"));

        System.out.println(library.books.size());

        System.out.println(library.books.get(0).getAuthor());

    }


}

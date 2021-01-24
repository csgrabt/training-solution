package iofilestest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {


    @Test

    void constructor(){
        Book book = new Book("Tolkien", "A két torony");


        assertEquals("Tolkien", book.getAuthor());
        assertEquals("A két torony", book.getTitle());



    }

}
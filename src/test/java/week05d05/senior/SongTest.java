package week05d05.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    Song song = new Song("Köpök rátok", 262, "Tankcsapda");


    @Test
    void getName() {
        assertEquals("Köpök rátok", song.getName());
    }

    @Test
    void getLengthInSeconds() {
        assertEquals(262, song.getLengthInSeconds());
    }

    @Test
    void getArtist() {
        assertEquals("Tankcsapda", song.getArtist());
    }

    @Test
    void nameIsNull() {
        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Song(null, 256, "Tankcspda")
        );
        assertEquals("Name/Artist is empty or null!", ioe.getMessage());
    }

    @Test
    void artistIsEmpty() {
        IllegalArgumentException ioe = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Song("Füst és dob", 125, "")
        );


        assertEquals("Name/Artist is empty or null!", ioe.getMessage());

    }

    @Test
    void lengthIsNotValid() {
        RuntimeException re = Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Song("Dávid és Góliát", -23, "Tankcsapda")
        );

    assertEquals("Length is not valid!", re.getMessage());

    }

    @Test
    void copyConstructor(){
        assertNotEquals(new Song(song), song);
    }


    @Test
    void toStringTest(){
        assertEquals("Title: Köpök rátok, Length: 262 sec, Artist: Tankcsapda;\n", song.toString());
    }

}
package week05d05.senior;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayListTest {
    List<Song> songs = new ArrayList<>();
    PlayList playList = new PlayList(songs);

    @BeforeEach
    void setUp() {
        playList.addToList(new Song("Legjobb méreg", 240, "Tankcsapda"));
        playList.addToList(new Song("Nem hagylak el", 241, "Tankcsapda"));
        playList.addToList(new Song("fiúk ölébe a lányok", 242, "Tankcsapda"));
        playList.addToList(new Song("Költözz el", 243, "Kasza Tibi"));

    }


    @Test
    void findByLengthGreaterThan() {
        assertEquals(3, playList.findByLengthGreaterThan(4).size());
    }

    @Test
    void doNotHaveMatch() {
        RuntimeException re = Assertions.assertThrows(IllegalArgumentException.class, () ->
                playList.findByLengthGreaterThan(10)
        );
        assertEquals("Do not have match!", re.getMessage());


    }

    @Test
    void toStringTest(){
        assertEquals("Title: Legjobb méreg, Length: 240 sec, Artist: Tankcsapda;\n" +
                "Title: Nem hagylak el, Length: 241 sec, Artist: Tankcsapda;\n" +
                "Title: fiúk ölébe a lányok, Length: 242 sec, Artist: Tankcsapda;\n" +
                "Title: Költözz el, Length: 243 sec, Artist: Kasza Tibi;\n", playList.toString());
    }

}
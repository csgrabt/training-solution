package week15d03;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {


    PostFinder ps = new PostFinder(new ArrayList<>());


    @BeforeEach
    void beforeEach() {


        LocalDate date = LocalDate.of(2020, 1, 20);

        Post post = new Post("Budapest, Training360", date, "mellények", "Training360");


        ps.addToList(post);


    }

    @Test
    void testAdd() {
        ps.addToList(new Post("Budapest, Training360", LocalDate.of(2020, 10, 11), "mellények", "Training360"));


        assertEquals(2, ps.getPosts().size());


    }

    @Test
    void testOwnerIsSame() {
        ps.addToList(new Post("Budapest, Training360", LocalDate.of(2020, 10, 11), "mellények", "Training360"));

        assertEquals(2, ps.findPostsFor("Training360").size());
    }

    @Test
    void testOwnerIsDifferent() {
        ps.addToList(new Post("Budapest, Training360", LocalDate.of(2020, 10, 11), "mellények", "Training36"));

        assertEquals(1, ps.findPostsFor("Training360").size());
        assertEquals(2, ps.getPosts().size());
    }


    @Test
    void testDateIsLater() {
        ps.addToList(new Post("Budapest, Training360", LocalDate.of(2025, 10, 11), "mellények", "Training36"));

        assertEquals(1, ps.findPostsFor("Training360").size());
        assertEquals(2, ps.getPosts().size());
    }


    @Test
    void testTitleIsEmpty() {
        ps.addToList(new Post("", LocalDate.of(2025, 10, 11), "mellények", "Training360"));

        assertEquals(1, ps.findPostsFor("Training360").size());
        assertEquals(2, ps.getPosts().size());
    }

    @Test
    void testContentIsEmpty() {
        ps.addToList(new Post("Budapest, Training360", LocalDate.of(2025, 10, 11), "mellények", ""));

        assertEquals(1, ps.findPostsFor("Training360").size());
        assertEquals(2, ps.getPosts().size());
    }


}
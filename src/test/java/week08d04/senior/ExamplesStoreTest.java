package week08d04.senior;

import org.junit.jupiter.api.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ExamplesStoreTest {
    ExamplesStore examplesStore = new ExamplesStore();



    @Test
    void testExamplesStore() {
        assertEquals(2, examplesStore.getTitlesOfExamples("examples.md").size());
    }


}
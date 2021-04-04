package week07d05.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SaveInputTest {
    SaveInput saveInput = new SaveInput();
    File file;
    List<String> list = List.of("Alma", "Karte", "Barack");
    String fileName = "Test.txt";

    @TempDir
    public File folder;


    @BeforeEach
    void setUp() {
        file = new File(folder, fileName);
        saveInput.saveInput(list, file.getPath());
    }

    @Test
    void saveInput() throws IOException {

    List<String> listReload = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        assertEquals(list, listReload);

    }
}
package week07d04.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingListTest {
    ShoppingList shoppingList = new ShoppingList();
    File file;
    @TempDir
    public File folder;

    @BeforeEach
    void setUp() {
        file = new File(folder, "shoppingList");
        List<String> shoppingList = List.of("Kenyér;2;30", "Alma;2;30");
        try (BufferedWriter bw = Files.newBufferedWriter(file.toPath())) {

            for (String item : shoppingList
            ) {
                bw.write(item);
                bw.newLine();
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }

    }

    @Test
    void calculateSum() {

        assertEquals(120, shoppingList.calculateSum(file.getPath()));
    }
}
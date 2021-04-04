package week07d05.senior;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class SaveInput {

    public void saveInput(List<String> stringList, String fileName) {

        try (BufferedWriter bw = Files.newBufferedWriter(Path.of(fileName), StandardCharsets.UTF_8)) {
            for (String item : stringList
            ) {
                bw.write(item);
                bw.newLine();
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Someting went wrong!", ioe);
        }
    }

}

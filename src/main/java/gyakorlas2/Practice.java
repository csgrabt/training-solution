package gyakorlas2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Practice {

    public void bfReader(String filename) {

                Path path = Path.of(filename);

                        try (BufferedReader bf = Files.newBufferedReader(path, Charset.forName("utf-8"))) {
                            String line;

                            while ((line = bf.readLine()) != null) {

                                System.out.println(line);

                            }


                            } catch (IOException ioe) {
                            throw new IllegalStateException("Something went wrong", ioe);
                            }
    }


    public static void main(String[] args) {
        Practice practice = new Practice();

        practice.bfReader("hachiko.str");
    }
}





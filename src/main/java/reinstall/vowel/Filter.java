package reinstall.vowel;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;

public class Filter {
    public static final List<String> FILTER = List.of("e", "é", "a", "á", "u", "ú", "ű", "ű", "i", "í", "o", "ó", "ö", "ő");

    public String filterFowels(BufferedReader reader) throws IOException {
        String line;

        StringBuilder sb = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            String line2=line.toLowerCase();
            for (int i = 0; i < line2.length(); i++) {
                if (isConsonantLetter(line2.substring((i), i + 1))) {
                    sb.append(line2.charAt(i));

                }
            }
            sb.append("\n");


        }

        return sb.toString();
    }

    private boolean isConsonantLetter(String c) {
        return !FILTER.contains(c);
    }


    public static void main(String[] args) {
        try (BufferedReader bf = Files.newBufferedReader(Path.of("file1.txt"))) {

            Filter f = new Filter();
            System.out.println(f.filterFowels(bf));


        } catch (IOException ioe) {
            throw new IllegalStateException("File is not found");


        }




    }

}

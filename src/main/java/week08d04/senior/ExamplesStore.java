package week08d04.senior;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExamplesStore {


    public static final String MARKER_CHARACTER = "#";

    public List<String> getTitlesOfExamples(String filename) {
        List<String> titles = new ArrayList<>();

        try (
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(Objects.requireNonNull(
                                ExamplesStore.class.getResourceAsStream(filename))))) {
            dataProcess(titles, reader);
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
        return titles;
    }

    private void dataProcess(List<String> titles, BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(MARKER_CHARACTER)) {
                titles.add(line.substring(1).trim());
            }
        }
    }

}

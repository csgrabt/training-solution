package gyakorlasDatabase;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private String filename;

    public FileReader(String filename) {
        this.filename = filename;
    }

    public List<Teacher> reader() {
        Path path = Path.of(filename);
        List<Teacher> result = new ArrayList<>();

        try (BufferedReader bf = Files.newBufferedReader(path)) {

            String line;
            while ((line = bf.readLine()) != null) {
                String nameOfTeacher = line;
                String topic = bf.readLine();
                String classes = bf.readLine();
                int hoursOfWeek = Integer.parseInt(bf.readLine());
                result.add(new Teacher(nameOfTeacher, topic, classes, hoursOfWeek));
            }

        } catch (IOException ioe) {


            throw new IllegalArgumentException("Something went wrong!");
        }


        return result;
    }


    public static void main(String[] args) {
        FileReader fl = new FileReader("ListOfClasses.txt");

        List list = fl.reader();

        System.out.println(list);

    }


}

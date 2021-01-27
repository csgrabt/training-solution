package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TeachingHoursCalculator {
    private String filename;

    public TeachingHoursCalculator(String filename) {
        this.filename = filename;
    }

    private List<Classes> makeAList(String nameOfTeacher) {
        Path path = Path.of(this.filename);

        List<Classes> classes = new ArrayList<>();

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line1;

            while ((line1 = bf.readLine()) != null) {


                if (line1.equals(nameOfTeacher)) {


                    classes.add(new Classes(line1, bf.readLine(), bf.readLine(), bf.readLine()));
                }
            }

        } catch (IOException ioe) {

            throw new IllegalStateException("Something is wrong", ioe);

        }


        return classes;
    }

    public String numberOfHours(String string) {
        List<Classes> classesOfTeacher = makeAList(string);
        int counter = 0;

        for (Classes classOfTeacher : classesOfTeacher
        ) {
            counter += classOfTeacher.getNumberOfHours();

        }


        return string + " össz óraszáma: " + counter;
    }


    public static void main(String[] args) {

        TeachingHoursCalculator tr = new TeachingHoursCalculator("ListOfClasses.txt");


        System.out.println(tr.numberOfHours("Maky Marcell"));


    }

}

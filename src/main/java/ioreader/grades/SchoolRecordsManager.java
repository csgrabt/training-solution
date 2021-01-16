package ioreader.grades;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SchoolRecordsManager {

    private List<Student> students = new ArrayList<>();


    public List<Student> getStudents() {
        return students;
    }

    public void readGradesFromFile(String s) {

        Path path = Path.of("src", "main", "resources", s);


        try (BufferedReader buffer = Files.newBufferedReader(path)) {
            String line;
            while ((line = buffer.readLine()) != null) {
                String[] temp = line.split(" ");

                List<Integer> markList = new ArrayList<>();
                for (int i = 1; i < temp.length; i++) {
                    markList.add(Integer.parseInt(temp[i]));
                }
                students.add(new Student(temp[0], markList));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public double classAverage() {

        double counter = 0.0;

        for (Student student : students
        ) {
            counter += student.average();

        }


        return counter / students.size();
    }
}

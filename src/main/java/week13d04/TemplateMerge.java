package week13d04;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TemplateMerge {


    public String merge(Path file, List<Employee> employees) {
        StringBuilder sb = new StringBuilder();

        String template;

        try (BufferedReader bf = Files.newBufferedReader(file)) {

            template = bf.readLine();

            for (int i = 0; i < employees.size(); i++) {
                String template1 = template.replace("{nev}", employees.get(i).getName());
                sb.append(template1.replace("{ev}", String.valueOf(employees.get(i).getYearOfBirth())));

                sb.append("\n");
            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong", ioe);
        }


        return sb.toString();
    }


    public static void main(String[] args) {

        TemplateMerge templateMerge = new TemplateMerge();

        Path file = Path.of("temaplate.txt");
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Kiss Béla", 1984));
        list.add(new Employee("Harcsa Lajos", 1984));
        list.add(new Employee("Csuka Márton", 1984));


        System.out.println(templateMerge.merge(file, list));


    }


}

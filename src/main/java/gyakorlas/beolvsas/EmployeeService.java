package gyakorlas.beolvsas;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;


public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");


        try (BufferedReader reader = Files.newBufferedReader(file);) {

            String line;
            while (( line = reader.readLine()) != null) {

                System.out.println(line);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

    }
}

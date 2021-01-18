package gyakorlas.beolvsas;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;


public class EmployeeService {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");


        List<String> employees = List.of("Alma", "Géza", "Béla");


        try (BufferedWriter write = Files.newBufferedWriter(file, StandardOpenOption.APPEND)){

            for (String employee: employees
                 ) { write.write(employee + "\n");

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

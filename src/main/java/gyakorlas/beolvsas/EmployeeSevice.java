package gyakorlas.beolvsas;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeSevice {

    public static void main(String[] args) {
        Path file = Path.of("employees.txt");
        List<String> content = null;
        try{
                    content = Files.readAllLines(file, Charset.forName("ISO-8859-2"));
                }catch (IOException e){
                    throw new IllegalStateException("Cannot read file!", e);
                }




    }
}

package iozip.names;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class EmployeeFileManager {


    public void saveEmployees(Path path, List<String> names) {

        try (ZipOutputStream zos = new ZipOutputStream(
                new BufferedOutputStream(
                        Files.newOutputStream(path)))) {
            zos.putNextEntry(new ZipEntry("names.dat"));
            for (String name:names
                 ) {zos.write(name.getBytes(StandardCharsets.UTF_8));

            }




        }catch (IOException ioe){
            throw new IllegalArgumentException("Something went wrong", ioe);
        }


    }

}

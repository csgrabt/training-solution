package ioreadstring.names;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


public class FileManager {

    private Path path;
    private List<Human> humans;


    public FileManager(String string) {
        this.path = Path.of(string);
        this.humans = new ArrayList<>();
    }

    public Path getMyFile() {
        return path;
    }

    public List<Human> getHumans() {
        return humans;
    }



    public void readFromFile(){
        List<String> content;
        try {
            content = Files.readAllLines(path, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file!", e);
        }

        for (String firstAndLastName : content
        ) {
            String firstName = firstAndLastName.substring(0, firstAndLastName.indexOf(" "));
            String lastName = firstAndLastName.substring(firstAndLastName.indexOf(" ") + 1);
            humans.add(new Human(firstName, lastName));
        }
    }




}

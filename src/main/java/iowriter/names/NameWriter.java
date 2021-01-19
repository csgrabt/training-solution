package iowriter.names;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NameWriter {


private Path path;


    public NameWriter(Path path) {
        this.path = path;
    }


    public void addAndWrite(String name) {

        try(BufferedWriter writer = Files.newBufferedWriter(this.path, StandardOpenOption.APPEND)){
            writer.write(name);
            writer.write("\n");

        }catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }



    }
}

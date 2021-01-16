package ioreadwritebytes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesReader {


   public Temperatures readTemperatures(String pathString){
       Path path = Path.of(pathString);

       byte[] temperature= new byte[0];
       try {
           temperature = Files.readAllBytes(path);
       } catch (IOException e) {
           e.printStackTrace();
       }

       return new Temperatures(temperature);}

}

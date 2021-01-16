/*Adott az aktuális könyvtárban több, fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály sumNumbers() metódusába dolgozz!*/


package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FilesSum {


    private boolean isValid(String string) {

        return Files.isRegularFile(Path.of(string));

    }


    private List<String> makeAList() {
        List<String> fileNames = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            String filename = String.format("number%02d.txt", i);
            if (isValid(filename)) {
                fileNames.add(filename);

            }
        }
        return fileNames;
    }


    public int sumNumbers() {

        List<String> validFiles = makeAList();
        int counter = 0;

        for (int i = 0; i < validFiles.size(); i++)

            try {
                counter += Integer.parseInt(Files.readString(Path.of(validFiles.get(i))));
            } catch (IOException | NumberFormatException e ) {
                   log(      e.toString()  +  " " + validFiles.get(i)  + "\r");
                   //System.out.println(e.toString());// throw new IllegalArgumentException("Cannot read file!", e);
            }


        return counter;
    }

    private void log(String string){
        Path file = Path.of("log.txt");
        try{
            Files.writeString(file, string, StandardOpenOption.APPEND);

        }
        catch (IOException ioe){
            throw new IllegalArgumentException("Can not write log file", ioe);
        }
    }


    }

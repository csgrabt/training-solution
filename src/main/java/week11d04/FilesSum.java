/*Adott az aktuális könyvtárban több, fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály sumNumbers(InputStream) metódusába dolgozz!*/


package week11d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FilesSum {


    private boolean isValid(String string) {

        return Files.isRegularFile(Path.of(string));

    }


    private List<String> makeAList() {
        List<String> fileNames = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            String filename = "number" + String.format("%02d", i);
            if (isValid(filename)) {
                fileNames.add(filename);

            }
        }
        return fileNames;
    }


    private int sumNumbers() {

        List<String> validFiles = makeAList();
        int counter = 0;

        for (int i = 0; i < validFiles.size(); i++)

            try {
                counter += Integer.parseInt(Files.readString(Path.of(validFiles.get(i))));
            } catch (IOException e) {
                throw new IllegalStateException("Cannot read file!", e);
            }


        return counter;
    }

    public static void main(String[] args) {
       int i = 20;

        System.out.println("number" + String.format("%02d", i));
    }
}
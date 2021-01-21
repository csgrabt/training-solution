package ioreadbytes.byteacount;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class ByteChecker {
    public int readBytesAndFindAs(String s) {
        int counter = 0;
        Path path = Path.of(s);


        try (InputStream ip = Files.newInputStream(path)) {

            byte[] buffer = new byte[1000];
            int size;
            while ((size = ip.read(buffer)) > 0) {
                counter += arrayCounter(buffer, size);
            }

        } catch (IOException ie) {
            throw new IllegalStateException("Cannot read file", ie);
        }


        return counter;
    }


    private int arrayCounter(byte[] tomb, int i) {
        int counter = 0;

        for (int g = 0; g < i; g++) {
            if (tomb[g] == 97) {
                counter++;
            }

        }


        return counter;
    }


}

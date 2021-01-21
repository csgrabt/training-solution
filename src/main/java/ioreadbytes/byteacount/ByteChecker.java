package ioreadbytes.byteacount;

import javax.imageio.stream.ImageInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class ByteChecker {
    public int readBytesAndFindAs(String s) {
        int counter = 0;
        Path path = Path.of(s);


        try (InputStream ip = Files.newInputStream(path)) {

            byte[] buffer = new byte[1000];
            int size = 0;
            while ((size = ip.read(buffer)) > 0) {

                counter += arrayCounter(buffer);

for (int i = 0; i < buffer.length; i++ ){
    buffer[i] = 0;

}

            }

        } catch (IOException ie) {
            throw new IllegalStateException("Cannot read file", ie);
        }


        return counter;
    }


private int arrayCounter(byte[] tomb){
//65, 97

   int counter = 0;
    for (byte n : tomb
         ) {
        if (n == 97 ){
            counter++;
        }
        
    }
return counter;}




}

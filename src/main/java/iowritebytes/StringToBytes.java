/*Hozz létre egy StringToBytes osztályt és készíts benne egy writeAsBytes() metódust!
 A metódus a paraméterként kapott szöveg listából az "_" jellel kezdődő szövegeken kívül
  minden mást kiír a szintén paraméterül kapott path-ra bináris fájlba.
 */

package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StringToBytes {


    public void writeAsBytes(List<String> list, Path path) {


        try (BufferedOutputStream bos = new BufferedOutputStream(Files.newOutputStream(path))) {


            for (String string : list
            )
                if (!(string.substring(0, 1).equals("_")))
                    bos.write(string.getBytes(StandardCharsets.UTF_8));


        } catch (IOException ie) {
            throw new IllegalStateException("Something went wrong", ie);
        }
    }


}




package iodatastream.statistics;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class HeightStatistics {


    public void saveHeights(List<Integer> heights, Path path) {
        int sizeOfList = heights.size();

        try(DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            os.writeInt(sizeOfList);

            for (Integer n:heights
                 ) {os.writeInt(n);

            }



        }catch (IOException ioe){
            throw  new IllegalStateException("something is wrong!", ioe);
        }





    }

    public static void main(String[] args) {
        File file = new File("statistics.dat");
        Path path = file.toPath();
        HeightStatistics statistics = new HeightStatistics();

        List<Integer> heights = List.of(198, 201, 211, 195, 214, 208, 203, 198);
        statistics.saveHeights(heights, path);
    }
}

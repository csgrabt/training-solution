package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Register {


    public void newMark(Path path, int i) {

        if (Files.exists(path)) {
            try {
                Files.writeString(path, Integer.toString(i) + "\n", StandardOpenOption.APPEND);
            } catch (IOException e) {
                throw new IllegalArgumentException("Can not read file!", e);
            }

        } else {
            try {
                Files.writeString(path, Integer.toString(i));
            } catch (IOException e) {
                new IllegalArgumentException("Can not read file", e);
            }
        }

    }


    public void average(Path path) {

        List<String> markList;

        try {
            markList = Files.readAllLines(path);
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot read file!", e);
        }

        double sum = 0.0;

        for (String mark : markList
        ) {
            sum += Double.parseDouble(mark);
        }

        try {
            Files.writeString(path, "average:" + (sum/markList.size()), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

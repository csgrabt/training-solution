package ioprintwriter.salary;


import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SalaryWriter {

    private List<String> names;


    public SalaryWriter(List<String> names) {
        this.names = names;
    }

    public void writeNamesAndSalaries(Path file) {

        try (PrintWriter printWriter = new PrintWriter(Files.newBufferedWriter(file))) {
            for (int i = 0; i < names.size(); i++) {
                printWriter.print(names.get(i));
                printWriter.print(": ");
                int placeOfPoint = names.get(i).indexOf(".");
                if (placeOfPoint > 0) {
                    String title = names.get(i).substring(0, placeOfPoint);
                    switch (title) {
                        case "Dr":
                            printWriter.println(500000);
                            break;
                        case "Mrs":
                        case "Mr":
                            printWriter.println(200000);
                            break;
                        default:
                            printWriter.println(100000);

                    }

                } else {
                    printWriter.println(100000);
                }

            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }


    }
}

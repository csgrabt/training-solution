package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import static closingproject.WriteTheReport.vaccinationListToPrint;
import static closingproject.WriteTheReport.writeTheNamesBasedOnZipToPrint;

public class ThirdMenuPoint {

    public static void thirdMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {
        try {

            System.out.println("Adta meg az irányító számot");
            String zip = scanner.nextLine();

            writeTheNamesBasedOnZipToPrint(
                    vaccinationListToPrint(cd.dailyVaccinationBasedOnZip(dataSource, zip)));

        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe.getMessage());
            System.out.println("Zárja be a programot a fájl megnyitásához");
        }
    }
}




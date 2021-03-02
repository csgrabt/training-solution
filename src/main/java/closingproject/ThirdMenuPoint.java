package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import static closingproject.Language.MessageHun.*;

import java.util.Scanner;

import static closingproject.MethodsToProgramWorking.vaccinationListToPrint;
import static closingproject.MethodsToProgramWorking.writeTheNamesBasedOnZipToPrint;

public class ThirdMenuPoint {

    public static void thirdMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {
        try {
            giveTheZipCode();
            String zip = scanner.nextLine();
            writeTheNamesBasedOnZipToPrint(
                    vaccinationListToPrint(cd.dailyVaccinationBasedOnZip(dataSource, zip)));
        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}




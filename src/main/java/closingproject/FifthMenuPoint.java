package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.Scanner;

public class FifthMenuPoint {
    public static void fifthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {

        System.out.println("Adja meg a taj számot:");
        String taj = scanner.nextLine();
        System.out.println("Adja meg a meghiúsúlás okát:");
        String note = scanner.nextLine();
        System.out.println("Adja meg a dátumot (yyyy-mm-dd)!");
        String date = scanner.nextLine();
        String status = "not ok";
        try {
            int citizen_id = cd.searchCitizenIdBasedOnTaj(dataSource, taj);
            LocalDate timeToDB = LocalDate.parse(date);
            cd.failedVaccination(dataSource, timeToDB, note, citizen_id, status);

        } catch (Exception ioe) {
            System.out.println(ioe.getMessage());
        }
    }

}


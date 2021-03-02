package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.Scanner;

import static closingproject.MessageHun.*;

public class FifthMenuPoint {
    public static void fifthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {

        giveTheTajNumber();
        String taj = scanner.nextLine();
        whyItFailed();
        String note = scanner.nextLine();
        giveMeTheDate();
        String date = scanner.nextLine();
        String status = statusWhenVaccinationIsNotOk();
        try {
            int citizen_id = cd.searchCitizenIdBasedOnTaj(dataSource, taj);
            LocalDate timeToDB = LocalDate.parse(date);
            cd.failedVaccination(dataSource, timeToDB, note, citizen_id, status);

        } catch (Exception ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}


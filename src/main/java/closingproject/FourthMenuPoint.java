package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.Scanner;

import static closingproject.MessageHun.*;
import static closingproject.MethodsToProgramWorking.*;

public class FourthMenuPoint {

    public static void fourthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {
        try {

            giveTheTajNumber();
            String taj = scanner.nextLine();

            int citizen_id = cd.searchCitizenIdBasedOnTaj(dataSource, taj);

            int numberOfVaccinations = cd.numberOfVaccination(dataSource, taj);


            switch (numberOfVaccinations) {
                case 0:
                    recordingVaccination(dataSource, cd, scanner, citizen_id, numberOfVaccinations);
                    break;
                case 1:
                    printTheNumberOfVaccinaDateOfVaccinaTypeOfVaccina(dataSource, cd, taj, numberOfVaccinations);
                    recordingVaccination(dataSource, cd, scanner, citizen_id, numberOfVaccinations);

                    break;
                default:
                    defultMessageSwithIn4thMenu(numberOfVaccinations);
            }

            dataRecorded();

        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe.getMessage() + backToMainMenu());
        }


    }


}

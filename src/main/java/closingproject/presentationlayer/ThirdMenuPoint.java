package closingproject.presentationlayer;

import closingproject.businesslogiclayer.Citizen;
import closingproject.dataacceslayer.CitizenDao;
import org.mariadb.jdbc.MariaDbDataSource;

import static closingproject.businesslogiclayer.language.MessageHun.*;

import java.util.Scanner;

import static closingproject.businesslogiclayer.MethodsToProgramWorking.*;
import static closingproject.businesslogiclayer.MethodsToProgramWorking.writeTheNamesBasedOnZipToPrint;

public class ThirdMenuPoint {

    public static void thirdMenuPoint(Scanner scanner) {
        try {
            giveTheZipCode();
            String zip = scanner.nextLine();
            dailyVaccinationsBasedOnZip(zip);
        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe.getMessage());
        }
    }


}




package covid.presentationlayer;

import static covid.businesslogiclayer.language.MessageHun.*;

import java.util.Scanner;

import static covid.businesslogiclayer.MethodsToProgramWorking.*;

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




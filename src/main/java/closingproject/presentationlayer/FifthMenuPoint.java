package closingproject.presentationlayer;

import java.util.Scanner;
import static closingproject.businesslogiclayer.FifthMenuMethods.*;
import static closingproject.businesslogiclayer.language.MessageHun.*;

public class FifthMenuPoint {
    public static void fifthMenuPoint(Scanner scanner) {

        giveTheTajNumber();
        String taj = scanner.nextLine();
        whyItFailed();
        String note = scanner.nextLine();
        giveMeTheDate();
        String date = scanner.nextLine();
        String status = statusWhenVaccinationIsNotOk();
        failedVaccinationRegister(taj, note, date, status);
    }


}


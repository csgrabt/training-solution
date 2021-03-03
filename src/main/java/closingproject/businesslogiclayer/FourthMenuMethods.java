package closingproject.businesslogiclayer;

import closingproject.dataacceslayer.CitizenDao;
import java.time.LocalDate;
import java.util.Scanner;
import static closingproject.businesslogiclayer.language.MessageHun.*;
import static closingproject.businesslogiclayer.language.MessageHun.invalidDateForm;


public class FourthMenuMethods {
    public static final CitizenDao cd = new CitizenDao();

    public static void recordingVaccination(Scanner scanner, int citizen_id, int numberOfVaccinations) {
        giveMeTheDate();
        String date = scanner.nextLine();
        try {
            LocalDate dateToDB = LocalDate.parse(date);
            typeOfVaccina();
            String type = scanner.nextLine();
            String status = getStatusWhenTheVaccinationIsOk();
            cd.vaccinationSetTimeAndType(dateToDB, type, citizen_id, status, numberOfVaccinations);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(invalidDateForm() + e.getMessage());
        }
    }

    public static Integer getNumberOfVaccinations(String taj) {
        return cd.numberOfVaccination(taj);
    }

    public static Integer getCitizenIdBasedOnTaj(String taj) {
        return cd.searchCitizenIdBasedOnTaj(taj);
    }

    public static void typeOfVaccinationFromDB(String taj) {
        System.out.println(typeOfTheVaccination() + cd.typeOfVaccination(cd.getDataSource(), taj));
    }

    public static void dateOfVaccinationFromDB(String taj) {
        System.out.println(dateOfTheLastVaccination() + cd.dateOfVaccination(taj));
    }
}

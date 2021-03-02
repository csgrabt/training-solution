package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import static closingproject.Language.MessageHun.*;

import java.util.Scanner;

public class FirstMenuPoint {

    private static final int AGE_DEFAULT = 0;
    private static final String CITY_DEFAULT = "";
    private static final String EMAIL1_DEFAULT = "AAA";
    private static final String EMAIL2_DEFAULT = "BBB";

    public static void firstMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {
        String name;
        int counterName = 0;
        do {
            if (counterName == 0) {
                firstMenuPrintln1();
                name = scanner.nextLine();
                counterName++;
            } else {
                firstMenuPrintln2();
                name = scanner.nextLine();
            }
        } while (!cz.validatorName(name));
        String nameOfTheCity = CITY_DEFAULT;
        String zipCode;
        do {
            giveTheZipCode();
            zipCode = scanner.nextLine();
            if (cz.validatorZipCode(zipCode, dataSource))
                try {
                    {
                        nameOfTheCity = cd.findCityByZipcode(dataSource, zipCode);
                    }
                } catch (IllegalArgumentException ie) {
                    fistMenuPrintln4(zipCode);
                }
        } while (nameOfTheCity.isEmpty());
        System.out.println(nameOfTheCity);
        int age = AGE_DEFAULT;
        do {
            try {
                fistMenuPrintln5();
                String ageAsAString = scanner.nextLine();
                age = Integer.parseInt(ageAsAString);
            } catch
            (NumberFormatException ioe) {
                fistMenuPrintln6();
            }
        } while (!cz.validatorAge(age));
        String email = EMAIL1_DEFAULT;
        String email2 = EMAIL2_DEFAULT;
        int counterEmail = 0;
        do {
            try {
                if (counterEmail != 0) {
                    fistMenuPrintln7();
                }
                fistMenuPrintln8();
                email = scanner.nextLine();
                cz.emailValidator(email);
                fistMenuPrintln9();
                email2 = scanner.nextLine();
                counterEmail++;
            } catch (IllegalArgumentException ioe) {
                fistMenuPrintln10();
            }
        } while (!email.equals(email2));
        boolean tajValidator = true;
        String taj;
        do {
            giveTheTajNumber();
            taj = scanner.nextLine();
            try {
                cz.validatorHealthInsuranceNumber(taj);
                tajValidator = false;
            } catch (IllegalArgumentException iae) {
                fistMenuPrintln12();
            }
        } while (tajValidator);
        try {
            Citizen citizen = new Citizen(name, zipCode, age, email, taj, dataSource);
            cd.writeRegistrationToDB(dataSource, citizen);
        } catch (
                IllegalArgumentException ioe
        ) {
            fistMenuPrintln13();
        }
    }
}
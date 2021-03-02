package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.time.LocalDate;
import java.util.Scanner;

public class FourthMenuPoint {

    public static void fourthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {
        try {

            System.out.println("Adja meg a TAJ számot!");
            String taj = scanner.nextLine();

            int citizen_id = cd.searchCitizenIdBasedOnTaj(dataSource, taj);

            int numberOfVaccinations = cd.numberOfVaccination(dataSource, taj);


            switch (numberOfVaccinations) {
                case 0:
                    recordingVaccination(dataSource, cd, scanner, citizen_id, numberOfVaccinations);
                    break;
                case 1:
                    System.out.println("Oltások száma: " + numberOfVaccinations);
                    System.out.println("Az oltás dátuma: " + cd.dateOfVaccination(dataSource, taj));
                    System.out.println("Az oltás típusa: " + cd.typeOfVaccination(dataSource, taj));
                    recordingVaccination(dataSource, cd, scanner, citizen_id, numberOfVaccinations);

                    break;
                default:
                    System.out.println(("Oltások száma: " + numberOfVaccinations + ", nincs szükség több oltásra! "));
            }

            System.out.println("Minden adatot rögzítettünk!");

        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe.getMessage() + "Térjen vissza a főmenübe és kezdje elölről!");
        }


    }

    private static void recordingVaccination(MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int citizen_id, int numberOfVaccinations) {
        System.out.println("Adja meg a dátumot (yyyy-mm-dd)!");
        String date = scanner.nextLine();
        try {
            LocalDate dateToDB = LocalDate.parse(date);
            System.out.println("Adja meg a vakcina típusát!");
            String type = scanner.nextLine();
            String status = "OK";
            cd.vaccinationSetTimeAndType(dataSource, dateToDB, type, citizen_id, status, numberOfVaccinations);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException("Invalid data form" + e.getMessage());
        }
    }

}

package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class FourthMenuPoint {

    public static void fourthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number){
        if (number == 4){
            System.out.println("Adja meg a TAJ számot!");
            String taj = scanner.nextLine();

            int citizen_id = cd.searchCitizenIdBasedOnTaj(dataSource, taj);

            int numberOfVaccinations = cd.vaccination(dataSource, taj);
            System.out.println("Oltások száma: " + numberOfVaccinations);

            switch(numberOfVaccinations) {
                case 0:
                    System.out.println("Adja meg a dátumot (yyyy-mm-dd)!");
                    String date = scanner.nextLine();
                    LocalDate dateToDB = LocalDate.parse(date);
                    //Date dateToDB = new SimpleDateFormat("dd/MM/yyyy").parse(date);
                    System.out.println("Adja meg a vakcina típusát!");
                    String type = scanner.nextLine();
                    cd.firstVaccination(dataSource, dateToDB, type, citizen_id);
                    cd.setTimeOfVaccination(dataSource, dateToDB, citizen_id, numberOfVaccinations);
                    break;
                case 1:
                    System.out.println("dddddd");
                    break;
                default:
                throw new IllegalArgumentException("Megkapta a maximális oltást!");
            }



        }

    }

}

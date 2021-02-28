package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.Scanner;

public class ThirdMenuPoint {

    public static void thirdMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        if (number == 3){
            System.out.println("We are working on it!(third)");
        }

    }
}

package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.Scanner;

public class FifthMenuPoint {
    public static void fifthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        if (number == 5){
            System.out.println("We are working on it! (fifth)");
        }

    }
}

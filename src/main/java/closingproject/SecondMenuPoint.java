package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.Scanner;

public class SecondMenuPoint {

    public static void secondMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        if (number == 2){
            System.out.println("We are working on it! (second)");
        }

    }
}

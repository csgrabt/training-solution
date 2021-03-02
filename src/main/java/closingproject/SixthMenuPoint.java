package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.List;
import java.util.Scanner;

public class SixthMenuPoint {
    public static void sixthMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {

        System.out.println("Adja meg az irányítószámot, ami alapján szürni szeretne!");
        String zipCode = scanner.nextLine();
        try {
            List<Integer> statistic = cd.statisticBasedOnZip(dataSource, zipCode);
            System.out.println(
                    cd.findCityByZipcode(dataSource, zipCode) + " város/település statisztikái (regisztrált lakosok száma: " + (statistic.get(0) + statistic.get(1) + statistic.get(2)) + "):" + "\n" +
                            "Nem oltottak száma: " + statistic.get(0) + "\n" +
                            "1. oltást megkapottak száma: " + statistic.get(1) + "\n" +
                            "2. oltást megkapottak száma: " + statistic.get(2)

            );

        } catch (IllegalArgumentException ioe) {
            System.out.println(ioe);
        }

    }

}


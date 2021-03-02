package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import static closingproject.Language.MessageHun.*;


public class SecondMenuPoint {

    public static void secondMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {

        try {
            secondMenuPritnln1();
            String path = scanner.nextLine();
            try {
                if (!(Files.exists(Path.of(path)))) {
                    throw new IllegalArgumentException(secondExeptionMassege1());
                }
                secondMenuPritnln2();
                String regex = scanner.nextLine();
                cd.writeRegisterFromFileToDb(dataSource, path, regex);
            } catch (IllegalArgumentException ioe) {
                secondMenuPritnln3(ioe);
            }
        } catch (ArrayIndexOutOfBoundsException ie) {
            secondMenuPritnln4(ie);
        }
    }
}

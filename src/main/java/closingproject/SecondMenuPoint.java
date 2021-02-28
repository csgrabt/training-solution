package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SecondMenuPoint {

    public static void secondMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        if (number == 2) {
            System.out.println("Adja meg a fájl elérési útvonalát(pl: C:/alma/alma.txt)!");
            String path = scanner.nextLine();

            if (!(Files.exists(Path.of(path)))) {
                throw new IllegalArgumentException("The file is not exist!");
            }

            System.out.println("Adja meg az elválasztó karaktert a fájlon belül!");
            String regex = scanner.nextLine();
            cd.writeRegisterFromFileToDb(dataSource, path, regex);
        }

    }
}

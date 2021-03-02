package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SecondMenuPoint {


    public static void secondMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner) {

        try {

            System.out.println("Adja meg a fájl elérési útvonalát(pl: C:/alma/alma.txt)!");
            String path = scanner.nextLine();

            try {
                if (!(Files.exists(Path.of(path)))) {
                    throw new IllegalArgumentException("A fájl nem létezik!");
                }

                System.out.println("Adja meg az elválasztó karaktert a fájlon belül!");
                String regex = scanner.nextLine();

                cd.writeRegisterFromFileToDb(dataSource, path, regex);
            } catch (IllegalArgumentException ioe) {
                System.out.println(" A művelet egy hiba miatt megszakadt!" + ioe);
            }


        } catch (ArrayIndexOutOfBoundsException ie) {
            System.out.println(ie.toString() + " Hiba a feldolgozás közben");

        }
    }


}

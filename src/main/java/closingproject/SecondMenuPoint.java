package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SecondMenuPoint {


    public static void secondMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        String inprogress = "1";
        do {
            if (number == 2) {
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
            }

            System.out.println("Mit kíván tenni? \n Üssön 1-est majd entert további fájlbeolvasáshoz! \n Minden más karakter bevitelével kilép a programból!");

            inprogress = scanner.nextLine();



        } while (inprogress.equals('1'));
    }


}

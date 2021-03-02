package closingproject;


import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class VaccinationMain {


    public static void main(String[] args) {
        List<String> menuPoints = List.of("1", "2", "3", "4", "5", "6");
        Citizen cz = new Citizen();
        MariaDbDataSource dataSource = new MariaDbDataSource();
        createDbConnection(dataSource);
        Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        flyway.migrate();

        CitizenDao cd = new CitizenDao();

        String progress;

        do {

            System.out.println(
                    "1. Regisztráció" + "\n" +
                            "2. Tömeges regisztráció" + "\n" +
                            "3. Generálás" + "\n" +
                            "4. Oltás" + "\n" +
                            "5. Oltás meghiúsulás" + "\n" +
                            "6. Riport");

            System.out.println("Adja meg, mit szeretne tenni:");
            Scanner scanner = new Scanner(System.in);

            int number = 0;

            boolean menu = true;
            do {
                String numberOfMenu = scanner.nextLine();

                if (menuPoints.contains(numberOfMenu)) {
                    number = Integer.parseInt(numberOfMenu);
                    menu = false;

                } else {
                    System.out.println("Nem létező menüpont!");
                }
            } while (menu);


            switch (number) {
                case 1:
                    FirstMenuPoint.firstMenuPoint(cz, dataSource, cd, scanner);
                    break;
                case 2:
                    SecondMenuPoint.secondMenuPoint(cz, dataSource, cd, scanner);
                    break;
                case 3:
                    ThirdMenuPoint.thirdMenuPoint(cz, dataSource, cd, scanner);
                    break;
                case 4:
                    FourthMenuPoint.fourthMenuPoint(cz, dataSource, cd, scanner);
                    break;
                case 5:
                    FifthMenuPoint.fifthMenuPoint(cz, dataSource, cd, scanner);
                    break;
                case 6:
                    SixthMenuPoint.sixthMenuPoint(cz, dataSource, cd, scanner);
                    break;
            }


            System.out.println("Mit kíván tenni? \n Üssön 1-est majd entert, hogy visszatérjen a főmenübe! \n Minden más karakter bevitelével kilép a programból!");

            progress = scanner.nextLine();

        } while (progress.equals("1"));


    }

    private static void createDbConnection(MariaDbDataSource dataSource) {
        try {

            dataSource.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");

        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }
    }


}





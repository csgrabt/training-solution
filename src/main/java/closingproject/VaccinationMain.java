package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.util.Scanner;


public class VaccinationMain {


    public static void main(String[] args) {
        Citizen cz = new Citizen();
        VaccinationMain vm = new VaccinationMain();
        MariaDbDataSource dataSource = new MariaDbDataSource();
        try {

            dataSource.setUrl("jdbc:mariadb://localhost:3306/ClosingProject?useUnicode=true");
            dataSource.setUser("alma");
            dataSource.setPassword("alma");

        } catch (SQLException se) {
            throw new IllegalArgumentException("Some problem with dataSource", se);
        }

        CitizenDao cd = new CitizenDao();

        String progress = "0";

        do {

            System.out.println(
                    "1. Regisztráció" + "\n" +
                            "2. Tömeges regisztráció" + "\n" +
                            "3. Generálás" + "\n" +
                            "4. Oltás" + "\n" +
                            "5. Oltás meghiúsulás");

            System.out.println("Adja meg, mit szeretne tenni:");
            Scanner scanner = new Scanner(System.in);

            int number = scanner.nextInt();
            scanner.nextLine();

            FirstMenuPoint.firstMenuPoint(cz, dataSource, cd, scanner, number);
            SecondMenuPoint.secondMenuPoint(cz, dataSource, cd, scanner, number);
            ThirdMenuPoint.thirdMenuPoint(cz, dataSource, cd, scanner, number);
            FourthMenuPoint.fourthMenuPoint(cz, dataSource, cd, scanner, number);
            FifthMenuPoint.fifthMenuPoint(cz, dataSource, cd, scanner, number);


            System.out.println("Mit kíván tenni? \n Üssön 1-est majd entert további adatok beviteléhet! \n Minden más karakter bevitelével kilép a programból!");

            progress = scanner.nextLine();

        } while (progress.equals("1"));


    }


}





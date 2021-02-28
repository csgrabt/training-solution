package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;

import java.util.Scanner;

public class FirstMenuPoint {
    public static void firstMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {

        if (number == 1) {
            System.out.println("Adja meg a páciens nevét!");
            String name = scanner.nextLine();
            cz.validatorName(name);
            System.out.println("Adja meg az irányítószámot!");
            String zipCode = scanner.nextLine();
            System.out.println(cd.findCityByZipcode(dataSource, zipCode));
            System.out.println("Adja meg az életkort!");
            int age = scanner.nextInt();
            cz.validatorAge(age);
            scanner.nextLine();
            System.out.println("Adja meg az email címet!");
            String email = scanner.nextLine();
            cz.emailValidator(email);
            System.out.println("Ismételje  meg az email címet!");
            String email2 = scanner.nextLine();
            if (!(email2.equals(email))) {
                throw new IllegalArgumentException("Az email címek nem egyezznek!");
            }
            System.out.println("Adja meg a TAJ számot!");
            String taj = scanner.nextLine();
            cz.validatorHealthInsuranceNumber(taj);

            Citizen citizen = new Citizen(name, zipCode, age, email, taj);

            cd.writeRegistrationToDB(dataSource, citizen);


        }
    }
}

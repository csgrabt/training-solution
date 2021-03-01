package closingproject;

import org.mariadb.jdbc.MariaDbDataSource;


import java.util.Scanner;

public class FirstMenuPoint {
    public static void firstMenuPoint(Citizen cz, MariaDbDataSource dataSource, CitizenDao cd, Scanner scanner, int number) {
        String inprogress = "0";
        do {
            if (number == 1) {

                String name;
                int counterName = 0;
                do {


                    if (counterName == 0) {
                        System.out.println("Adja meg a páciens nevét!");
                        name = scanner.nextLine();
                        counterName++;
                    } else {

                        System.out.println("Helytelen név páciens nevét!");
                        name = scanner.nextLine();
                    }

                } while (!cz.validatorName(name));


                String nameOfTheCity = "";
                String zipCode;
                do {
                    System.out.println("Adja meg az irányítószámot!");
                    zipCode = scanner.nextLine();
                    if (cz.validatorZipCode(zipCode, dataSource))

                        try {
                            {
                                nameOfTheCity = cd.findCityByZipcode(dataSource, zipCode);
                            }
                        } catch (IllegalArgumentException ie) {
                            System.out.println("A táblázat nem tartalmazza a megadott irányító számot " + zipCode);
                        }

                } while (nameOfTheCity.isEmpty());


                System.out.println(nameOfTheCity);

                int age = 0;

                do {
                    try {
                        System.out.println("Adja meg az életkort!");
                        String ageAsAString = scanner.nextLine();
                        age = Integer.parseInt(ageAsAString);
                    } catch
                    (NumberFormatException ioe) {
                        System.out.println("Az életkort számmal kell megadni, ne legyen szóköz a végén!");
                    }
                } while (!cz.validatorAge(age));

                String email = "aaa";
                String email2 = "bbb";
                int counterEmail = 0;
                do {
                    try {
                        if (counterEmail != 0) {
                            System.out.println("A két eamik cím nem egyezik!");
                        }
                        System.out.println("Adja meg az email címet!");
                        email = scanner.nextLine();
                        cz.emailValidator(email);
                        System.out.println("Ismételje  meg az email címet!");
                        email2 = scanner.nextLine();
                        counterEmail++;
                    } catch (IllegalArgumentException ioe) {
                        System.out.println("Az email formátuma nem megfelelő");
                    }

                } while (!email.equals(email2));

                boolean tajValidator = true;

                String taj;
                do {
                    System.out.println("Adja meg a TAJ számot!");
                    taj = scanner.nextLine();
                    try {
                        cz.validatorHealthInsuranceNumber(taj);
                        tajValidator = false;
                    } catch (IllegalArgumentException iae) {
                        System.out.println("Hibás taj szám!");
                    }
                } while (tajValidator);

                try {

                    Citizen citizen = new Citizen(name, zipCode, age, email, taj, dataSource);

                    cd.writeRegistrationToDB(dataSource, citizen);
                } catch (
                        IllegalArgumentException ioe
                ) {
                    System.out.println("Hiba történt az adatbázis írása sorám (Esetleg az adatbázis már tartalmazza a taj számot)!");
                }
                System.out.println("Mit kíván tenni? \n Üssön 1-est majd entert további adatok beviteléhet! \n Minden más karakter bevitelével kilép a programból!");

                inprogress = scanner.nextLine();


            }
        } while (inprogress.equals("1"));
    }
}
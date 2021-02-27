package closingproject;

import java.util.Scanner;

public class VaccinationMain {

    public static void main(String[] args) {
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

        if (number == 1){
            System.out.println("Adja meg a páciens nevét!");
            String name = scanner.nextLine();
            System.out.println("Adja meg az irányítószámot!");
            String zipCode = scanner.nextLine();
            System.out.println("Adja meg az életkort!");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Adja meg az email címet!");
            String email = scanner.nextLine();
            System.out.println("Adja meg a TAJ számot!");
            String taj = scanner.nextLine();

            Citizen citizen = new Citizen(name, zipCode, age, email, taj);



        }else{
            System.out.println("anyád");
        }



    }


}

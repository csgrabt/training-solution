package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("Adja meg a nevét!");
        String name = scanner.nextLine();
        System.out.println("Adja meg a jelszavát!");
        String p1 = scanner.nextLine();

        System.out.println("Ismételje meg a jelszavát!");
        String p2 = scanner.nextLine();

        System.out.println("Adja meg az email címét!");
        String email = scanner.nextLine();


        UserValidator s = new UserValidator();

        System.out.println(s.isValidUsername(name) ? "Helyes a név" : "Helytelen a név");
        System.out.println(s.isValidPassworld(p1, p2) ? "Helyes a jelszó" : "Helytelen a jelszó");
        System.out.println(s.isValidEmail(email) ? "Helyes az email cím" : "Helytelen az email cím");




    }
}

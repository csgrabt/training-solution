package cheetsheat;

import java.util.Scanner;

public class ScannerHelp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = scanner.nextLine();

        System.out.println("What's your year of birth?");
        int yearOfBirth = scanner.nextInt();


        //Vigyázz a nextInt() metódussal, mert az nem olvassa be a sorvége jelet, és a következő nextLine() nem fog működni.

        int age = scanner.nextInt();
        scanner.nextLine(); //Ez fogja az ottmaradt sorvége jelet beolvasni

        String name2 = scanner.nextLine();

        //Helyette jobb lehet a következő (NumberFormatException kivételt dob, ha nem szám):

        String line = scanner.nextLine();
        int age2 = Integer.parseInt(line); // Exception-t



    }
}

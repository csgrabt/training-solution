package nincsmegadvapackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {



        System.out.println("Adja meg az első kör átmérőjét:");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();


        System.out.println("Adja meg a 2. kör átmérőjét:");

        int b = scanner.nextInt();

        Circle circle = new Circle(a);
        Circle circle1 = new Circle(b);



        System.out.println(circle.area() == circle1.area());

        System.out.println(circle.kerulet() == circle1.kerulet());
    }
}
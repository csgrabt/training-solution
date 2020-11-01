package introcontrol;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {


        int a = 0;
        Scanner scanner = new Scanner(System.in);


    for (int i = 1; i <= 5; i++){
        System.out.println("Adjon meg a számot!");
        a= a + scanner.nextInt();
    }
        System.out.println(a);

    }




}

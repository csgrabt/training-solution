package nincsmegadvapackage;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
       // System.out.println("Adja meg a következő számítás eredményét: \n (4+7)/(3-7)*(2+4)");



        System.out.println("Mi az alábbi művelet eredménye? " + "(0.1*3/0.5-1/0.2)");


        Scanner scanner = new Scanner(System.in);

        float b = scanner.nextFloat();


        System.out.println(Math.abs((0.1*3/0.5-1/0.2)-b)<0.001);


    }





}

package week04;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {

    Random rnd = new Random();
        int randomNumber = rnd.nextInt(100)+1;


        System.out.println(randomNumber);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tippelj!");

        int tippNumber = scanner.nextInt();

        for (int i = 0; i < 5; i++){
            if(randomNumber != tippNumber){
                System.out.println("Tippelj újra, adj meg egy számot:");
                tippNumber = scanner.nextInt();;}else{
                System.out.println("Eltaláltad!");

            }
            }
        }


    }











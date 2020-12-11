package week04d03;

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

        for (int i = 0; i < 6; i++){
            if (i ==5){
                System.out.println("Nincs több lehetőség, vesztettél!");
            return;
            }
            if(randomNumber != tippNumber){
                System.out.println("Tippelj újra, adj meg egy számot:");
                tippNumber = scanner.nextInt();;}else{
                System.out.println("Eltaláltad!");
return;
            }
            }
        }


    }











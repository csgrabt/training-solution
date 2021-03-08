package classstructureattributes;
import java.util.Scanner;

/*
Készíts main() metódust egy Music osztályba,
 ahol kérd be a felhasználótól a kedvenc zeneszáma adatait!
  Ellenőrzésképp írd ki a megadott adatokat előadó - cím (hossz percben) formában,
   azaz Britney Spears - Oops!...I Did It Again (4 perc)!
*/


public class Music {

    public static void main(String[] args) {
        Song song = new Song();
        System.out.println("Adja meg a kedvenc zeneszáma adatait (szerző - cím - hossz (mp)):");
        Scanner scanner = new Scanner(System.in);
        song.band = scanner.nextLine();
        song.title = scanner.nextLine();
        song.length= scanner.nextInt();

        System.out.println(song.band + " - " + song.title + " (" + song.length/60 + " perc )");

    }
}

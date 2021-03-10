package classstructureattributes;
import java.util.Scanner;


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

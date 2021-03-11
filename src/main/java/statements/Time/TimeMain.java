package statements.Time;

import java.util.Scanner;

public class TimeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg az órát:");
        int hour = scanner.nextInt();
        System.out.println("Adja meg a perceket:");
        int min = scanner.nextInt();
        System.out.println("Adja meg a másodperceket:");
        int sec = scanner.nextInt();

        Time time1 = new Time(hour, min, sec);


        System.out.println("Adja meg az órát:");
        int hour1 = scanner.nextInt();
        System.out.println("Adja meg a perceket:");
        int min1 = scanner.nextInt();
        System.out.println("Adja meg a másodperceket:");
        int sec1 = scanner.nextInt();

        Time time2 = new Time(hour1, min1, sec1);

        System.out.println("Az első időpont: " + time1.toString() + "   " + time1.getInMinutes() + " perc");


        System.out.println("A második időpont: " + time2.toString() + "   " + time2.getInSecond() + " másodperc");


        System.out.println("Az első időpont korábbi mint a második? " + time1.earlierThan(time2));


    }
}

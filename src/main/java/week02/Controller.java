package week02;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        Controller controller = new Controller();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány tárgyalót szeretne rögzíteni?");

        Office office = new Office();

        int a = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i < a + 1; i++) {
            System.out.println("Adja meg az" + i + ". Office nevét");
            String b = scanner.nextLine();
            System.out.println("Adja meg az" + i + ". Office hosszát");
            int c = scanner.nextInt();
            System.out.println("Adja meg az" + i + ". Office szélességét");
            int d = scanner.nextInt();
            scanner.nextLine();
            MeetingRoom meetingRoom = new MeetingRoom(b, c, d);
            office.addMeetingRoom(meetingRoom);
        }


        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");


        System.out.println("Adjon meg a számát a menüpontnak (1-7)");
        int numberOfMenu = scanner.nextInt();

        if (0 < numberOfMenu && 7 >= numberOfMenu) {
            if (numberOfMenu == 1) {
                office.printNames();
            }
            if (numberOfMenu == 2) {
                office.printNamesReverse();
            }

            if (numberOfMenu == 3) {
                office.printEvenNames();
            }

            if (numberOfMenu == 4){
             office.printAreas();
            }
if (numberOfMenu == 5){
    scanner.nextLine();
    System.out.println("Keresett Meetingroom neve (Figyeljen a kis és nagybetűkre!)?");
    String name = scanner.nextLine();
    office.printMeetingRoomsWithName(name);}


if (numberOfMenu == 6){
    scanner.nextLine();
    System.out.println("Adja meg a keresett Meetingroom névtöredékét!");
    String part = scanner.nextLine();
    office.printMeetingRoomsContains(part);
}


if (numberOfMenu == 7){
    scanner.nextLine();
    System.out.println("Adja meg a Meetingroom minimális területét!");
    int area = scanner.nextInt();
    office.printAreaLargerThan(area);

            }


}

         else {
            System.out.println("Nem létező menünpont");
        }

    }
}






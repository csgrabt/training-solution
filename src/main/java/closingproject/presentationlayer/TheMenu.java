package closingproject.presentationlayer;

import closingproject.businesslogiclayer.ProjectConfig;

import java.util.Scanner;

import static closingproject.businesslogiclayer.language.MessageHun.*;

public class TheMenu {
    public static void menu(ProjectConfig sys) {
        String progress;
        do {
            menuPrintln1();
            menuPrintln2();
            Scanner scanner = sys.getScanner();
            int number = menuSelection(sys);
            switch (number) {
                case 1 -> FirstMenuPoint.firstMenuPoint(sys.getCz(), scanner);
                case 2 -> SecondMenuPoint.secondMenuPoint(scanner);
                case 3 -> ThirdMenuPoint.thirdMenuPoint(scanner);
                case 4 -> FourthMenuPoint.fourthMenuPoint(scanner);
                case 5 -> FifthMenuPoint.fifthMenuPoint(scanner);
                case 6 -> SixthMenuPoint.sixthMenuPoint(scanner);
            }
            menuPrintln4();
            progress = scanner.nextLine();
        } while (progress.equals("1"));
    }

    private static int menuSelection(ProjectConfig sys) {
        int number = 0;
        boolean menu = true;
        do {
            String numberOfMenu = sys.getScanner().nextLine();

            if (sys.getMenuPoints().contains(numberOfMenu)) {
                number = Integer.parseInt(numberOfMenu);
                menu = false;

            } else {
                menuPrintln3();
            }
        } while (menu);
   return number;}


}

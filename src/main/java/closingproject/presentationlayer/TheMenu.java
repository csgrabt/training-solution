package closingproject.presentationlayer;

import closingproject.businesslogiclayer.ProjectConfig;
import closingproject.businesslogiclayer.language.Language;

import java.util.Scanner;

import static closingproject.businesslogiclayer.language.MessageHun.*;

public class TheMenu {
    public static void menu(ProjectConfig sys) {
        Scanner scanner = sys.getScanner();
        //languageSelector(sys, scanner);
        String progress;
        do {
            menuPrintln1(sys);
            menuPrintln2(sys);
            int number = menuSelection(sys);
            switch (number) {
                case 1 -> FirstMenuPoint.firstMenuPoint(sys.getCz(), scanner);
                case 2 -> SecondMenuPoint.secondMenuPoint(scanner);
                case 3 -> ThirdMenuPoint.thirdMenuPoint(scanner);
                case 4 -> FourthMenuPoint.fourthMenuPoint(scanner, sys.getVaccinaMenu());
                case 5 -> FifthMenuPoint.fifthMenuPoint(scanner);
                case 6 -> SixthMenuPoint.sixthMenuPoint(scanner);
            }
            if (exit(number)) return;
            menuPrintln4();
            progress = scanner.nextLine();
        } while (progress.equals("1"));
    }


    private static boolean exit(int number) {
        if(number == 7){
            return true;
        }
        return false;
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
        return number;
    }


}

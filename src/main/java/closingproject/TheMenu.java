package closingproject;

import java.util.Scanner;

import static closingproject.MessageHun.*;

public class TheMenu {
    public static void menu(SysClosing sys) {
        String progress;
        do {
            menuPrintln1();
            menuPrintln2();
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            boolean menu = true;
            do {
                String numberOfMenu = scanner.nextLine();

                if (sys.getMenuPoints().contains(numberOfMenu)) {
                    number = Integer.parseInt(numberOfMenu);
                    menu = false;

                } else {
                    menuPrintln3();
                }
            } while (menu);
            switch (number) {
                case 1:
                    FirstMenuPoint.firstMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
                case 2:
                    SecondMenuPoint.secondMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
                case 3:
                    ThirdMenuPoint.thirdMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
                case 4:
                    FourthMenuPoint.fourthMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
                case 5:
                    FifthMenuPoint.fifthMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
                case 6:
                    SixthMenuPoint.sixthMenuPoint(sys.getCz(), sys.getDataSource(), sys.getCd(), scanner);
                    break;
            }
            menuPrintln4();
            progress = scanner.nextLine();
        } while (progress.equals("1"));
    }









}

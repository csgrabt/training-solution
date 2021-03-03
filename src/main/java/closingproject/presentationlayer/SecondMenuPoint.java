package closingproject.presentationlayer;

import java.util.Scanner;
import static closingproject.businesslogiclayer.language.MessageHun.*;
import static closingproject.businesslogiclayer.SecondMenuMethods.*;


public class SecondMenuPoint {

    public static void secondMenuPoint(Scanner scanner) {

        try {
            secondMenuPritnln1();
            String path = scanner.nextLine();
            dataProcessing(scanner, path);
        } catch (ArrayIndexOutOfBoundsException ie) {
            secondMenuPritnln4(ie);
        }
    }


}

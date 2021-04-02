package week08d01;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private static final List<String> VALID_CHARACTERS = List.of("L", "F", "J", "B");
    private int x = 0;
    private int y = 0;


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private List<String> steps(String string) {
        if (string == null) {
            throw new IllegalArgumentException("String is null!");
        }
        List<String> stepsList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            stepsList.add(string.substring(i, i + 1).toUpperCase());
        }
        return stepsList;
    }


    public String move(String string) {

        List<String> stepsList = steps(string);


        for (String item : stepsList) {
            if (!VALID_CHARACTERS.contains(item)) {
                throw new IllegalArgumentException("The step is invalid!");
            }

            if (item.equals("F")) {
                y = y + 1;
            }
            if (item.equals("L")) {
                y = y - 1;
            }
            if (item.equals("B")) {
                x = x - 1;
            }
            if (item.equals("J")) {
                x = x + 1;
            }
        }
        return "y= " + getY() + "\n" + "x= " + getX();
    }


}




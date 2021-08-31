package hackearRannk;

import java.util.Arrays;
import java.util.List;

public class DaysOfTheWeek {
    private static final List<String> days = Arrays.asList("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    private static final List<Integer> mounts = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);


    public static String findDay(int month, int day, int year) {

        int dayCounter = day;

        for (int i = 2000; i < year; i++) {
            if (isLeapYear(i)) {
                dayCounter += 366;
            } else {
                dayCounter += 365;
            }
        }
        for (int i = 0; i < month - 1; i++) {
            dayCounter += mounts.get(i);
        }
        if (isLeapYear(year) && month >= 3) {
            dayCounter++;
        }
        return days.get((dayCounter - 1) % 7).toUpperCase();

    }


    public static boolean isLeapYear(int year) {
        boolean a = year % 4 == 0;
        boolean b = year % 400 == 0;
        boolean c = year % 100 == 0;

        if (c && !b) {
            return false;
        }


        return a;
    }
}

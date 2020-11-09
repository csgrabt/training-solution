package enumtype.week;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {
    public static void main(String[] args) {
        WorkdayCalculator m =new WorkdayCalculator();
        System.out.println( m.dayTypes(Day.P, 10));
}

    public List<String> dayTypes(Day firstDay, int numberOfDays){
        List<String> listOfDayType = new ArrayList<>();
        int b = 0;
        if (firstDay.equals(Day.H)){
            b = 0;
        }
        if (firstDay.equals(Day.K)){
            b = 1;
        }
        if (firstDay.equals(Day.SZE)){
            b = 2;
        }
        if (firstDay.equals(Day.CS)){
            b = 3;
        }
        if (firstDay.equals(Day.P)){
            b = 4;
        }
        if (firstDay.equals(Day.SZO)){
            b = 5;
        }
        if (firstDay.equals(Day.V)){
            b = 6;
        }
        for(int i = b; i <= numberOfDays+b-1; i++ )
         {listOfDayType.add(Day.values()[i%Day.values().length].getB().toString());

        }
        return listOfDayType;
    }}

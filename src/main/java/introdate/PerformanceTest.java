package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {
    public static void main(String[] args) {
        Performance performance = new Performance("Queen",
                LocalDate.of(2020, 12, 30),
                LocalTime.of(10, 30), LocalTime.of(12, 30));


        System.out.println(performance.getInfo());

    }


}

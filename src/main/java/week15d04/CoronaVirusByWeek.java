package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.*;

public class CoronaVirusByWeek {


    private static final int TIME_INTERVAL_WEEKS = 3;
    private static final String COUNTRY = "HUNGARY";
    private static final String SEPARATOR_TIME = "-";
    private static final String SEPARATOR_DATE = "/";


    public List<Week> findWeeks(String filename) {
        Path path = Path.of(filename);

        //Map<Integer, Data> result = new TreeMap<>();
        List<Data> nextTry = new ArrayList<>();
        try (BufferedReader bf = Files.newBufferedReader(path)) {
            bf.readLine();
            String line;
            while ((line = bf.readLine()) != null) {
                Data data = processingData(line);

                if (data.getCountriesAndTerritories().equalsIgnoreCase(COUNTRY)) {
                    nextTry.add(data);

                }
            }


        } catch (IOException ioe) {
            throw new IllegalStateException("Something went wrong!", ioe);
        }

       Collections.sort(nextTry, new Comparator<Data>() {
           @Override
           public int compare(Data o1, Data o2) {
               return o1.getCasesWeekly()-o2.getCasesWeekly();
           }
       });

        return weeksWithMostCase(nextTry);

    }


    private Data processingData(String string) {

        String[] array = string.split(",");

        return new Data(createDate(array),
                createWeek(array),
                Integer.parseInt(array[2]),
                Integer.parseInt(array[3]),
                array[4]);
    }

    private LocalDate createDate(String[] string) {

        String[] date = string[0].split(SEPARATOR_DATE);

        return LocalDate.of(Integer.parseInt(date[2]), Integer.parseInt(date[1]), Integer.parseInt(date[0]));
    }

    private Week createWeek(String[] string) {

        String[] date = string[1].split(SEPARATOR_TIME);

        return new Week(Integer.parseInt(date[0]), Integer.parseInt(date[1]));

    }


    private List<Week> weeksWithMostCase(List<Data> listOfData) {
        List<Week> weekWithMostCase = new ArrayList<>();


        for (int i = listOfData.size() - TIME_INTERVAL_WEEKS; i < listOfData.size(); i++) {
            weekWithMostCase.add(listOfData.get(i).getWeek());

        }
        return weekWithMostCase;
    }


    public static void main(String[] args) {
        CoronaVirusByWeek cw = new CoronaVirusByWeek();


        System.out.println(cw.findWeeks("data.csv"));

    }


}

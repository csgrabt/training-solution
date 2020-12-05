package defaultconstructor.date;

import java.util.Arrays;
import java.util.List;

public class SimpleDate {

private int year;
private int month;
private int day;



    public void setDate(int year, int month, int day){
    if (!(isCorrect(year, month, day))){throw new IllegalArgumentException("One or more given parameter cannot be applied! " + year + ", "  + month + ", " + day);}

    this.year = year;
    this.month = month;
    this.day = day;
    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private boolean isCorrect(int year, int month, int day){
    if (year <= 1900){return false;}
    if (month < 0 || month >12){return false;}
    List<Integer> mountList31day = Arrays.asList(1,3,5,7,8,10,12);
    List<Integer> mountList30day = Arrays.asList(4, 6, 9, 11);

    if (mountList30day.contains(month)){
        if (day < 0  || day > 30){return false;}
    }
    if (mountList31day.contains(month)){
            if (day < 0  || day > 31){return false;}
        }
    if (month == 2){
           if (isLeapYear(year)){
               if(day < 0 || day > 29){ return false;}}else{
                   if (day < 0  || day > 28){return false;}
               }
           }



    return true;}



/*Mely évek a szökőévek?
Szökőévek a következők: minden néggyel osztható év, kivéve a százzal is oszthatókat.
Szökőévek viszont a 400-zal osztható évek.
Vagyis a századfordulók évei közül csak azok szökőévek, amelyek 400-zal is oszthatók.

Ez alapján tehát szökőév 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024.
Nem szökőév 1700, 1800, 1900, 2100, 2200 és 2300. Viszont szökőévek a következő esztendők: 1600, 2000 és 2400. by Wiki*/

    private boolean isLeapYear(int year){
    if (year % 400 == 0){return true;}
    if (year % 4 == 0 && year % 100 != 0){return true;}


        return false;}




   // private int calculateMonthLength(int year, int month){return 0;}


    public static void main(String[] args) {
        SimpleDate simpleDate = new SimpleDate();
        System.out.println(
    simpleDate.isCorrect(2000, 11, 31 ));
    }
}

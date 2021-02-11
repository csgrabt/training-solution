package week15d04;

public class Week {
    private int year;
    private int numberOfWeek;


    public Week(int year, int numberOfWeek) {
        this.year = year;
        this.numberOfWeek = numberOfWeek;
    }


    public int getYear() {
        return year;
    }

    public int getNumberOfWeek() {
        return numberOfWeek;
    }

    @Override
    public String toString() {
        return year + "-"+ numberOfWeek;
    }
}

package statements.Time;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        if (hour < 0 || hour > 23){
            throw new IllegalArgumentException("Az óra 0-23 intervallumban vehet fel értéket!");
        }
        if (min < 0 || min > 59 || sec <0 || sec > 59){
            throw new IllegalArgumentException("Az perc, másodperc 0-59 intervallumban vehet fel értéket!");
        }
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getInMinutes() {
        return hour * 60 + min;
    }

    public int getInSecond() {
        return getInMinutes() * 60 + sec;

    }

    public boolean earlierThan(Time other) {
        int thisTimeInSecond = this.getInSecond();
        int otherTimeInSecond = other.getInSecond();
        return thisTimeInSecond < otherTimeInSecond;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

}

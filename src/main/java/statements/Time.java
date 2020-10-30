package statements;

public class Time {
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int getInMinutes() {
        return hour * 60 + min;
    }

    public int getInSecound() {
        return getInMinutes() * 60 + sec;

    }

    public boolean earlierThan(Time other) {
        int thisTimeInSecond = this.getInSecound();
        int otherTimeInSecond = other.getInSecound();
        return thisTimeInSecond < otherTimeInSecond;
    }

    public String toString() {
        return hour + ":" + min + ":" + sec;
    }

}

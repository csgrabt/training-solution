package constructoroverloading.bus;

public class SimpleTime {

private int hours;
private int minutes;


    public SimpleTime(int hours, int minutes){
        this.hours = hours;
        this.minutes = minutes;
    }
    public SimpleTime(int hours){
        this.hours = hours;


    }
    public SimpleTime(SimpleTime time){
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
    }


    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }


    public int difference(SimpleTime time){
        int a = (getHours()*60) + getMinutes() - time.getMinutes() - (time.getHours()*60);
        return a;
    }


    @Override
    public String toString() {
        return hours + ":" + minutes;
    }
}

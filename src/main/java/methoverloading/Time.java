package methoverloading;

public class Time {

    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }


    public Time(int hours) {
        this.hours = hours;
    }


    public Time(Time time){
        this.hours = time.getHours();
        this.minutes = time.getMinutes();
        this.seconds = time.getSeconds();
    }


    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    private int getInSeconds(){
        return hours*3600+minutes*60+seconds;
    }


    public boolean isEqual(Time time){

    return getInSeconds() == time.getInSeconds();
    }



    public boolean isEqual(int hours, int minutes, int seconds){
    Time time = new Time(hours, minutes, seconds);
    return getInSeconds() == (time.getInSeconds());}




    public boolean isEarlier(Time time){

        return getInSeconds() < (time.getInSeconds());

    }







    public boolean isEarlier(int hours, int minutes, int seconds){


        Time time = new Time(hours, minutes, seconds);
        return getInSeconds() < (time.getInSeconds());}

    }



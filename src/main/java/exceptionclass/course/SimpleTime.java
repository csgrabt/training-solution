package exceptionclass.course;

public class SimpleTime {
    private int hour;
    private int minute;


    public SimpleTime(int hour, int minute) {
        validator(hour, minute);
        this.hour = hour;
        this.minute = minute;
    }

    public SimpleTime(String str){
        try { validator(str);


     int hour1 = Integer.parseInt(str.substring(0, str.indexOf(":")));
     int minute1 = Integer.parseInt(str.substring(str.indexOf(":") + 1));



    validator(hour, minute);

        this.hour = hour1;
        this.minute = minute1;
        }catch (NumberFormatException ex){throw new InvalidTimeException("Time is not hh:mm");}
    }



    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }



private void validator(int a, int b) {
    if (a <= -1 || a >= 24) {
        throw new InvalidTimeException("Hour is invalid (0-23)");
    }
    if (b <= -1 || b > 59) {
        throw new InvalidTimeException("Minute is invalid (0-59)");
    }
}

private void validator(String string){
    if(string == null){
        throw new InvalidTimeException("Time is null");
    }
    if(string.length() !=5 || string.indexOf(":") !=2){
        throw new InvalidTimeException("Time is not hh:mm");
    }
}


    @Override
    public String toString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}



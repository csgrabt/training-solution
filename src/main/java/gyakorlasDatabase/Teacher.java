package gyakorlasDatabase;

public class Teacher {
    private String nameOfTeacher;
    private String topic;
    private String classes;
    private int hoursOfWeek;

    public Teacher(String nameOfTeacher, String topic, String classes, int hoursOfWeek) {
        this.nameOfTeacher = nameOfTeacher;
        this.topic = topic;
        this.classes = classes;
        this.hoursOfWeek = hoursOfWeek;
    }


    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getTopic() {
        return topic;
    }

    public String getClasses() {
        return classes;
    }

    public int getHoursOfWeek() {
        return hoursOfWeek;
    }
}

package week13d03;

public class Classes {

    private String nameOfTeacher;
    private String topic;
    private String titleOfCass;
    private int numberOfHours;




    public Classes(String nameOfTeacher, String topic, String titleOfCass, String numberOfHours) {
        this.nameOfTeacher = nameOfTeacher;
        this.topic = topic;
        this.titleOfCass = titleOfCass;
        this.numberOfHours = Integer.parseInt(numberOfHours);
    }




    public String getNameOfTeacher() {
        return nameOfTeacher;
    }

    public String getTopic() {
        return topic;
    }

    public String getTitleOfCass() {
        return titleOfCass;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }
}

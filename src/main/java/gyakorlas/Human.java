package gyakorlas;

public class Human {


 public static final int DEFAUT_FREE_TIME =4;

 private String name;

 private int age;


    public static int getDefautFreeTime() {
        return DEFAUT_FREE_TIME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

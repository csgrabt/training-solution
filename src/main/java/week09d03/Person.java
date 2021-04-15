package week09d03;

import java.util.Random;

public class Person {
    private final String name;
    private final int age;
    private Present present;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    private void presentGenerator(int bound, int plus) {
        Random rnd = new Random();
        int a = rnd.nextInt(bound) + plus;
        switch (a) {
            case 1:
                this.present = Present.TOY;
                break;
            case 2:
                this.present = Present.ELECTRONIC;
                break;
            case 3:
                this.present = Present.DECORATION;
                break;
            case 4:
                this.present = Present.HOUSEKEEPING;
                break;
        }
    }

    public void setPresent() {

        if (getAge() <= 14) {
            presentGenerator(Present.values().length, 1);
        } else {
            presentGenerator(Present.values().length - 1, 2);
        }


    }


}










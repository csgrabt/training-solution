package week09d03;

import java.util.Random;

public class Person {
    private String name;
    private int age;
    private Present present;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }






        private void presentGenerator(int bound, int plus){
            Random rnd = new Random();
        int a = rnd.nextInt(bound)+plus;
            switch (a) {
                case 1:
                    this.present = Present.Toy;
                    break;
                case 2:
                    this.present = Present.Electronic;
                    break;
                case 3:
                    this.present = Present.Decoration;
                    break;
                case 4:
                    this.present = Present.Housekepping;
                    break;}
}

    public void setPresent() {

        if (getAge() <= 14){presentGenerator(4,1);
        }else {
            presentGenerator(3,2);}



}





        }










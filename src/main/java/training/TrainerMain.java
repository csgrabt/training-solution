package training;

import java.util.Scanner;

public class TrainerMain {

    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Mennyi a korod?");
        int yearOfBirth = scanner.nextInt();

        Trainer trainer = new Trainer(name, yearOfBirth);

        System.out.println(trainer.getNameAndYearOfBirth());
    }




}
/*public class TrainerMain {

    public static void main(String[] args) {
        Trainer tariner = new Trainer("John Doe", 1980);
        System.out.println(tariner.getName());
        System.out.println(tariner.getYearOfBirth());

        Trainer tariner1 = new Trainer("Jack Doe", 1997);
        System.out.println(tariner1.getName());
        System.out.println(tariner1.getYearOfBirth());


    }



}*/

/* korábbi feladathoz tartozó részek public class TrainerMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        trainer.setName("John Doe");
        trainer.setYearOfBirth(1980);
        System.out.println(trainer.getName());
        System.out.println(trainer.getYearOfBirth());

        Trainer anotherTrainer = new Trainer();
        anotherTrainer.setName("Jack Doe");
        anotherTrainer.setYearOfBirth(1984);
        System.out.println(anotherTrainer.getName());

        System.out.println(anotherTrainer.getName());
        System.out.println(anotherTrainer.getNameAndYearOfBirth());

        anotherTrainer.chanegName("Joe Doe");
        System.out.println(anotherTrainer.getName());

        anotherTrainer.setName("Jack Doe");
        System.out.println(anotherTrainer.getName());

    }}*/


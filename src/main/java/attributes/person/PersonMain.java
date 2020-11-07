package attributes.person;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("Béla", "AFG54637",
                new Address("Canada", "Flamandia", "1. Steet 15", "58478"));


        System.out.println(person.persontToString());


        //person.moveToAddres();

        System.out.println(person.getAddres());




    }
}

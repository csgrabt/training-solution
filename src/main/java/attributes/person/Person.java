package attributes.person;

public class Person {
    private String name;
    private String identificationCard;
    private Address theAdrress;

    public Person(String name, String identificationCard, Address theAdrress) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.theAdrress = theAdrress;
    }

    public String persontToString() {
        return getName() + " " + getIdentificationCard() + " " + theAdrress.addressToString();
    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }

    public void moveToAddres(){
        theAdrress.correctData();
    }

    public String getAddres(){
       return theAdrress.addressToString();
    }
}




package attributes.person;

import java.util.Scanner;

public class Address {
    private String country;
    private String city;
    private String streetAndNumber;
    private String zipCode;


    public Address(String country, String city, String streetAndNumber, String zipCode) {
        this.country = country;
        this.city = city;
        this.streetAndNumber = streetAndNumber;
        this.zipCode = zipCode;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String addressToString(){

        return getZipCode() +" " + getStreetAndNumber() + " " + getCity() +  " " + getCountry();
    }


    Scanner scanner = new Scanner(System.in);

    public void correctData() {
        System.out.println("Adja meg a pontos country!");
        String a = scanner.nextLine();
        setCountry(a);
        System.out.println("Adja meg a várost!");
        String b = scanner.nextLine();
        setCity(b);
        System.out.println("Adja meg az utcát és a házszámot!");
        String c = scanner.nextLine();
        setStreetAndNumber(c);
        System.out.println("Adja meg az irányítószámot!");
        String d = scanner.nextLine();
        setZipCode(d);
    }
}
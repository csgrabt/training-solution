package introexception;

public class Patient {
    public static final int MIN_YEAR = 1900;

private String name;
private String socialSecurityNumber;
private int yearOfBirth;


    public Patient(String name, String ssn, int yearOfBirth){
        if (name.equals(null)){throw new IllegalArgumentException();}
        if (name.equals("")){throw new IllegalArgumentException();}
        if (yearOfBirth <= MIN_YEAR){throw new IllegalArgumentException();}
        this.name = name;
        this.socialSecurityNumber = ssn;
        this.yearOfBirth = yearOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}


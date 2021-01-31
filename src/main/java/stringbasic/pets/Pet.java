package stringbasic.pets;

import java.time.LocalDate;

public class Pet {


    private String name;
    private LocalDate yearOfBirth;
    private Gender gender;
    private String regNumber;


    public Pet(String name, LocalDate yearOfBirth, Gender gender, String regNumber) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.regNumber = regNumber;
    }



    public String getName() {
        return name;
    }

    public LocalDate getYearOfBirth() {
        return yearOfBirth;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public Gender getGender() {
        return gender;
    }
}


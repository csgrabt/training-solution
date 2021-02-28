package closingproject;

import javax.sql.DataSource;

public class Citizen {

    private int id;
    private String fullName;
    private String zipCode;
    private int age;
    private String email;
    private String healthInsuranceNumber;


    public Citizen() {

    }


    public Citizen(int id, String fullName, String zipCode, int age, String email, String healthInsuranceNumber) {
        this.id = id;
        this.fullName = fullName;
        this.zipCode = zipCode;
        this.age = age;
        this.email = email;
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public Citizen(String fullName, String zipCode, int age, String email, String healthInsuranceNumber, DataSource dataSource) {
        validatorName(fullName);
        validatorAge(age);
        validatorZipCode(zipCode, dataSource);
        validatorHealthInsuranceNumber(healthInsuranceNumber);
        emailValidator(email);
        this.fullName = fullName;
        this.zipCode = zipCode;
        this.age = age;
        this.email = email;
        this.healthInsuranceNumber = healthInsuranceNumber;
    }

    public String getFullName() {
        return fullName;
    }


    public String getZipCode() {
        return zipCode;
    }


    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }


    public String getHealthInsuranceNumber() {
        return healthInsuranceNumber;
    }


    public void validatorName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name can not be null or empty!");
        }
    }

    public void validatorZipCode(String zipCode, DataSource dataSource) {
        if (zipCode.length() != 4) {
            throw new IllegalArgumentException("Invalid Zip Code!");
        }
        new CitizenDao().findCityByZipcode(dataSource, zipCode);



    }

    public void validatorAge(int age) {
        if (age < 10 || age > 150) {
            throw new IllegalArgumentException("Age is not correct!");
        }

    }


    public void emailValidator(String string) {
        if (string.length() <= 2 || !(string.contains("@"))) {
            throw new IllegalArgumentException("Email address is not valid!");
        }
    }

    public void validatorHealthInsuranceNumber(String insuranceNumber) {


        if (insuranceNumber.length() != 9) {
            throw new IllegalArgumentException("The length of the insurance number is wrong!");
        }

        int b = insuranceNumber.length();
        int even = 0;
        int odd = 0;

        for (int i = 1; i < b - 1; i = i + 2) {
            int d;
            try {
                d = Integer.parseInt("" + insuranceNumber.charAt(i));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("One of the Character is not number!");
            }
            even += (d * 7);
        }
        for (int i = 0; i < b - 1; i = i + 2) {
            int d;
            try {
                d = Integer.parseInt("" + insuranceNumber.charAt(i));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("One of the Character is not number!");
            }
            odd += (d * 3);

        }
        boolean osztas = (even + odd) % 10 == Integer.parseInt("" + insuranceNumber.charAt(b - 1));

        if (!osztas) {
            throw new IllegalArgumentException("Health insurance number is wrong!");
        }


    }
}

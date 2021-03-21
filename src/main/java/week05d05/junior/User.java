package week05d05.junior;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email address does not contain \"@\"");
        }
        if (!email.contains(".")) {
            throw new IllegalArgumentException("Email address does not contain \".\"");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return firstName + " " + lastName;


    }


}

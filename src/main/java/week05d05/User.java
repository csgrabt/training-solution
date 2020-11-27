package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        if (email.indexOf("@") ==  -1 ){throw new IllegalArgumentException("no @");}
        if (email.indexOf(".") ==  -1 ){throw new IllegalArgumentException("no .");}

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

    public String getFullName(){
        String fullName = firstName +  " " + lastName;

    return fullName;
    }


}

package week07d02.senior;

public class UserIml implements User{

    private final String userName;
    private final String firstName;
    private final String lastName;


    public UserIml(String userName, String firstName, String lastName) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }



}

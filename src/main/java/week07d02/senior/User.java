package week07d02.senior;

public interface User {

    String getUsername();

    String getFirstName();

    String getLastName();

    default String getFullName() {

        return getFirstName() + " " + getLastName();
    }

    static User of(String username, String firstName, String lastName) {
        return new UserIml(username, firstName, lastName);
    }
}

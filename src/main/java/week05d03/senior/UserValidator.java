package week05d03.senior;

import java.util.List;

public class UserValidator {


    public void validate(List<User> userList) {
        ifListIsNull(userList);

        for (User item : userList
        ) {
            userIsNull(item);
            ageValidator(item);
            nameValidator(item);
        }
    }

    private void nameValidator(User item) {
        if (item.getName() == null || item.getName().isEmpty()) {
            throw new IllegalArgumentException("Name is not valid!");
        }
    }

    private void ageValidator(User item) {
        if (item.getAge() < 0 || item.getAge() > 120) {
            throw new IllegalArgumentException("Age is not valid!");
        }
    }

    private void userIsNull(User item) {
        if (item == null) {
            throw new IllegalArgumentException("User is null!");
        }
    }

    private void ifListIsNull(List<User> userList) {
        if (userList == null) {
            throw new IllegalArgumentException("List is null!");
        }
    }


}

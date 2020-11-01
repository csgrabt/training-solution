package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
private String name;
private LocalDate dateOfBirth;
private LocalDateTime beginEmployee;

public Employee( int year, int mount, int day, String name){
    this.name = name;
    this.dateOfBirth = LocalDate.of(year, mount, day);
    this.beginEmployee = LocalDateTime.now();

}

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDateTime getBeginEmployee() {
        return beginEmployee;
    }

    public void setName(String name) {
        this.name = name;
    }
}

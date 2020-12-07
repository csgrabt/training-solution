package gyakorlas;

import java.util.ArrayList;
import java.util.List;

public class Trainer extends Human{
private List<String> course = new ArrayList<>();


    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }
}

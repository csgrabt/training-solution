package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    List<Person> personList;


    public SantaClaus(List<Person> personList) {
        this.personList = personList;
    }


    public void getThroughChimneys() {

        for (Person n : this.personList
        ) {
            n.setPresent();

        }
    }


}

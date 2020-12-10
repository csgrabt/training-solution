package week07d04;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lab {
private String title;
private Enum<KESZ> complate;
private LocalDateTime complatedAt;

    public Lab(String title) {
        this.title = title;
        this.complate = KESZ.FALSE;
    }

    public Lab(String title, LocalDateTime complatedAt) {
        this.title = title;
        this.complatedAt = complatedAt;
        this.complate = KESZ.TRUE;
    }




    public void complated(LocalDateTime complatedAt) {
        this.complatedAt = complatedAt;
        this.complate = KESZ.TRUE;
    }

    public void complated() {
        this.complatedAt = LocalDateTime.now();
        this.complate = KESZ.TRUE;
    }


    @Override
    public String toString() {
        if (complatedAt == null) {
            return "A(z) " + title + " feladat " + complate.toString();
        }
        if (!(complatedAt == null)) {
            return "A(z) " + title + " feladat " + complate.toString() + " "  + complatedAt;
        }
     return "alma";}


     public static void main(String[] args) {
     Lab lab = new Lab ("alma");

lab.complated();
        System.out.println(lab.toString());


    }


}


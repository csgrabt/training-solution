package week07d04.junior;


import java.time.LocalDateTime;

public class Lab {
    private final String title;
    private Enum<KESZ> complete;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        this.complete = KESZ.FALSE;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.complete = KESZ.TRUE;
    }


    public String getTitle() {
        return title;
    }

    public Enum<KESZ> getComplete() {
        return complete;
    }

    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    public void completed(LocalDateTime completedAt) {
        this.completedAt = completedAt;
        this.complete = KESZ.TRUE;
    }

    public void completed() {
        this.completedAt = LocalDateTime.now();
        this.complete = KESZ.TRUE;
    }


    @Override
    public String toString() {
        if (completedAt == null) {
            return "A(z) " + title + " feladat " + complete.toString();
        }

        return "A(z) " + title + " feladat " + complete.toString() + " " + completedAt;

    }


}


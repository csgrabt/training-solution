package gyakorlas2.trainer;

import java.time.LocalDateTime;

public class Auction {

    private int price;
    private LocalDateTime start;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Auction(int price, LocalDateTime start, User user) {
        this.price = price;
        this.start = start;
        this.user = user;
    }

    public Auction(int price) {
        this.price = price;
    }


    public Auction(int price, LocalDateTime start) {
        this.price = price;
        this.start = start;
    }

    public Auction(Auction auction){
        this.price = auction.price;
        this.start = auction.start;
        this.user = auction.user;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }
}

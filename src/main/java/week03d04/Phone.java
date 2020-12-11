package week03d04;

public class Phone {

    private String prefinx;
    private int number;

    public Phone(String prefinx, int number) {
        this.prefinx = prefinx;
        this.number = number;
    }




    @Override
    public String toString() {
        return prefinx + "-" + number;
    }
}

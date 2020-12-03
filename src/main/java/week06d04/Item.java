package week06d04;

public class Item {
    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        if (month <=0 || month < 12){throw new IllegalArgumentException("Date is not valid!");}
        if (price <= 0){throw new IllegalArgumentException("Price is not valid!");}
        this.price = price;
        this.month = month;
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}

package week06d04.junior;

public class Item {
    private final int price;
    private final int month;
    private final String name;

    public Item(int price, int month, String name) {
        validator(price, month);
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

    private void validator(int price, int month) {
        if ( month > 12 || month < 0){throw new IllegalArgumentException("Date is not valid!");}
        if (price <= 0){throw new IllegalArgumentException("Price is not valid!");}
    }

}

package exam05gyakorlas;

public class OfficeSoftware extends Software {
    private static final double INCREASE_PERCENT = 5.0;

    public OfficeSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
      priceIncrease(getPrice()+getPrice()*INCREASE_PERCENT/100);
    }





}

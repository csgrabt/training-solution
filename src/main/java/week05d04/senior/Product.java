package week05d04.senior;

public class Product {
    private long price;
    private Currency currency;

    public long getPrice() {
        return price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Product(long price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public double convertPrice(Currency currency) {
        if (this.currency.equals(currency)) {
            return this.price;
        } else {
            return this.price * ((double) this.currency.getExchangeRate() / currency.getExchangeRate());
        }
    }
}
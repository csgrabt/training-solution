package week05d04.senior;

public enum Currency {
    HUF(1), USD(300), EUR(600);

    private long exchangeRate;

    Currency(long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public long getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(long exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}

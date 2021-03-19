package week05d04.senior;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, Currency.EUR);

    @Test
    void productTest() {
        assertEquals(1, product.getPrice());
        assertEquals(600, product.getCurrency().getExchangeRate());
    }

    @Test
    void convertPrice() {

        assertEquals(1, product.convertPrice(Currency.EUR));
        assertEquals(2, product.convertPrice(Currency.USD));
        assertEquals(600, product.convertPrice(Currency.HUF));
    }

    @Test
    void currencySetTest() {
        Currency.USD.setExchangeRate(250);
        assertEquals(250, Currency.USD.getExchangeRate());
    }

}
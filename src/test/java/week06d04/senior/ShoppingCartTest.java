package week06d04.senior;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    ShoppingCart shoppingCart = new ShoppingCart();

    @BeforeEach
    void setUp() {
        shoppingCart.addItem("Alma", 10);
        shoppingCart.addItem("Körte", 10);
        shoppingCart.addItem("Szöllő", 10);
        shoppingCart.addItem("Síkosító", 10);
    }

    @Test
    void addNewItem() {
        shoppingCart.addItem("LEGO", 1);
        assertEquals(5, shoppingCart.getItems().size());
    }


    @Test
    void addNewQuantity() {
        shoppingCart.addItem("Alma", 1);
        assertEquals(11, shoppingCart.getItems().get(0).getQuantity());
    }

    @Test
    void getItem() {
        assertEquals(10, shoppingCart.getItem("Alma") );
    }
}
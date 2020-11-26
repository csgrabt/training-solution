package week05d04;
import org.junit.jupiter.api.Test;
import week04.schoolrecords.Student;
import week05d03.ListCounter;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StoreTest {


    @Test
    public void productTest() {
        Product product = new Product("Liszt", 2025, 12, 6);


        assertEquals("Liszt", product.getName());
        assertEquals("2025-12-06", product.getExpirationDate().toString());}




@Test
public void addTest(){
    Product product1 = new Product("Liszt", 2025, 12, 6);
    Product product2 = new Product("Liszt", 2025, 12, 6);
    Product product3 = new Product("Liszt", 2025, 12, 6);

    Store store = new Store();

    store.addProduct(product1);
    store.addProduct(product2);
    store.addProduct(product3);
    assertEquals(3, store.getProductList().size());

}


    @Test
    public void getNumberOfExpiredTest(){
        Product product1 = new Product("Liszt", 2010, 12, 6);
        Product product2 = new Product("Liszt", 2010, 12, 6);
        Product product3 = new Product("Liszt", 2025, 12, 6);

        Store store = new Store();

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        assertEquals(2, store.getNumberOfExpired());

    }

    @Test
    public void isExperiedTest(){
        Product product1 = new Product("Liszt", 2010, 12, 6);
        Product product2 = new Product("Liszt", 2010, 12, 6);
        Product product3 = new Product("Liszt", 2025, 12, 6);
        Store store = new Store();

        assertEquals(false, store.isExperied(product1));
        assertEquals(true, store.isExperied(product3));

    }

/*    @Test
    public void listNotHaveTest(){
        Product product1 = new Product("Liszt", 2010, 12, 6);
        Product product4 = new Product("Liszt", 2025, 12, 6);
        Product product5 = new Product("Vaj", 2010, 12, 6);
        Product product7 = new Product("Vaj", 2025, 12, 6);

        Store store = new Store();

        store.addProduct(product1);


        assertEquals(false, store.listNotHave(product4));
        //assertEquals(false, store.listNotHave(product5));

    }*/




    }



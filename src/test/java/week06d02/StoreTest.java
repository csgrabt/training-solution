package week06d02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StoreTest {
    List<Product> list = new ArrayList<>();
    Store store = new Store(list);

    @BeforeEach
    void setUp() {
        Product product1 = new Product("Kifli", Category.FROZEN, 20);
        Product product2 = new Product("Kifli", Category.DAIRY, 20);
        Product product3 = new Product("Kifli", Category.OTHER, 20);
        Product product4 = new Product("Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product("Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product("Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product("Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product("Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
    }

    @Test
    void productTypeCounter() {
        assertEquals(2, store.getProductByCategoryName(Category.FROZEN));
        assertEquals(1, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(4, store.getProductByCategoryName(Category.BAKEDGOODS));
    }


    @Test
    void productTypeFROZENCounter() {
        assertEquals(2, store.getProductFrozen());

    }


    @Test
    void productTypeDAIRCounter() {
        assertEquals(1, store.getProductDairy());

    }

    @Test
    void productTypeBAKEDGOODSCounter() {
        assertEquals(4, store.getProductBakedGoods());

    }

    @Test
    void productTypeOTHERCounter() {
        assertEquals(1, store.getProductOther());

    }

    @Test
    void productList() {
        assertEquals("[Bakedgoods - 4 ps(s), Frozen - 2 ps(s), Other - 1 ps(s), Daity - 1 ps(s)]",
                store.getProductsByCategory().toString());

    }


    @Test
    void productListlessCopy() {

        assertEquals(5, store.getProductsByCategoryLessCopy().size());
        assertEquals("FROZEN", store.getProductsByCategoryLessCopy().get(0).getType());
        assertEquals(4, store.getProductsByCategoryLessCopy().get(2).getPieces());


    }

    @Test
    void getProductsByCategoryUsingMap() {

       assertEquals(4, store.getProductsByCategoryUsingMap().get(Category.BAKEDGOODS));
        System.out.println(store.getProductsByCategoryUsingMap().toString());
    }
}

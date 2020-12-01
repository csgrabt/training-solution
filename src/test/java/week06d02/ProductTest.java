package week06d02;

import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {




    @Test
    public void productTypeCounter() {
        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);
        assertEquals(2, store.getProductByCategoryName(Category.FROZEN));
        assertEquals(1, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(4, store.getProductByCategoryName(Category.BAKEDGOODS));
    }


    @Test
    public void productTypeFROZENCounter() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);




        assertEquals(2, store.getProductFrozen());

    }



    @Test
    public void productTypeDAIRCounter() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);




        assertEquals(1, store.getProductDaity());

    }

    @Test
    public void productTypeBAKEDGOODSCounter() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);




        assertEquals(4, store.getProductBakedgoods());

    }

    @Test
    public void productTypeOTHERCounter() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);




        assertEquals(1, store.getProductOther());

    }

    @Test
    public void productList() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);

        assertEquals("[Bakedgoods - 4 ps(s), Frozen - 2 ps(s), Other - 1 ps(s), Daity - 1 ps(s)]",
                        store.getProductsByCategory().toString());

    }


    @Test
    public void productListlessCopy() {

        List<Product> list= new ArrayList<>();
        Store store =new Store(list);
        Product product1 = new Product( "Kifli", Category.FROZEN, 20);
        Product product2 = new Product( "Kifli", Category.DAIRY, 20);
        Product product3 = new Product( "Kifli", Category.OTHER, 20);
        Product product4 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product5 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product6 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product7 = new Product( "Kifli", Category.BAKEDGOODS, 20);
        Product product8 = new Product( "Kifli", Category.FROZEN, 20);
        list.add(product1);
        list.add(product2);
        list.add(product3);
        list.add(product4);
        list.add(product5);
        list.add(product6);
        list.add(product7);
        list.add(product8);

        assertEquals("[FROZEN - 2ps(s), DAIRY - 1ps(s), BAKEDGOODS - 4ps(s), OTHER - 1ps(s)]",
                store.getProductsByCategoryLessCopy().toString());

    }




}

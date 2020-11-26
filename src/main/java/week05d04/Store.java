package week05d04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList = new ArrayList<>();


    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }


    //bonusz 1
    public int getNumberOfExpired() {
        int expired = 0;

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getExpirationDate().isBefore(LocalDate.now())) {
                expired++;
            }

        }


        return expired;
    }


//bónusz2


    public boolean isExperied(Product product) {

        return product.getExpirationDate().isAfter(LocalDate.now());
    }

    public boolean listNotHave(Product product) {
boolean b = false;
if (isExperied(product)){
    for (Product p : productList
         ) {p.getName().equals(product.getName());
        b = productList.add(product);
    }
}
        return b;}
}

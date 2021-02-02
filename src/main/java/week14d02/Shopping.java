package week14d02;

import java.util.List;

public class Shopping {

    private String id;
    private List<String> products;


    public Shopping(String id, List<String> products) {
        this.id = id;
        this.products = products;
    }


    public String getId() {
        return id;
    }

    public List<String> getProducts() {
        return products;
    }
}

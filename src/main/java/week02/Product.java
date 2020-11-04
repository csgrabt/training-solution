package week02;

public class Product {
    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean TheyEqual(Product prodact) {
        return name.equals(prodact.getName());
    }


    public static void main(String[] args) {

        Product product = new Product("Alma", "12345");
        Product product1 = new Product("Alma", "12345");
        Product product2 = new Product("körte", "23456");

        System.out.println(product.TheyEqual(product1));
        System.out.println(product.TheyEqual(product2));


    }

}
package classsctructureconstructors;

public class Store {

    private String product;

    private int stock;

    public Store (String product){
        this.product = product;

    }
public void store(int amount){

        this.stock = this.stock + amount;}

public void dispatch(int amount1){

        this.stock = this.stock - amount1;}


    public int getStock() {
        return stock;
    }
}



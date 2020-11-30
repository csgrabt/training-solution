package methodstructure.pendrives;

public class Pendrives {
    private String name;
    private int capacity;
    private int price;


    public Pendrives(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrives{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }

public void risePrice(int percent){
        price = price * percent/100;

}

public int ratio(){
        return price/capacity;
}


public int comparePricePerCapacity(Pendrives pendrives){
        if (ratio() > pendrives.ratio()){return -1;}
        if (ratio() > pendrives.ratio()){return 1;}
        return 0;
}

public  boolean cheaperThan(Pendrives pendrives){

        return price < pendrives.getPrice();
}








}

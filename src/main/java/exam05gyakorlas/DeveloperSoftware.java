package exam05gyakorlas;

public class DeveloperSoftware extends Software {
    private static final double INCREASE_PERCENT = 10.0;



    public DeveloperSoftware(String name, double price) {
        super(name, price);
    }

    @Override
    public void increasePrice() {
        ;
    }


    public static void main(String[] args) {


        Software software = new OfficeSoftware("Winfos", 1000.0);
        software.increasePrice();
        System.out.println(software.getPrice());
    }

}



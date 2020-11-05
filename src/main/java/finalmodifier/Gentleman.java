package finalmodifier;

public class Gentleman {
    private String name;

    public Gentleman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static final String MASSAGE_PREFIX = "Valami ";

    public String sayHello(String name) {
        return MASSAGE_PREFIX + name;
    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman("Béla");

        System.out.println(gentleman.sayHello(gentleman.getName()));


    }

}

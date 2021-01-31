package numbers;

public class CircleMain {
    public static void main(String[] args) {


        Circle c1 = new Circle(1);
        Circle c2 = new Circle(3);


        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c2.area());
        System.out.println(c2.perimeter());

    }
}

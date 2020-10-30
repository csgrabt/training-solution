package localvariables;


public class DistanceMain {

    public static void main(String[] args) {
        Distance dis1 = new Distance(854754.5475, true);
        System.out.println("Távolság:" +dis1.getX1() + "helyes a távolság? " + dis1.isB());

        int i = (int) dis1.getX1();
        System.out.println(i);

    }

}

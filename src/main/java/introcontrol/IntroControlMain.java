package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl introControl = new IntroControl();

        System.out.println(introControl.substractTenIfGreaterThanTen(100));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.calculateConsumption(1, 5));
        introControl.printNumbers(15);
        introControl.printNumbersBetween(1, 5);

        introControl.printNumbersBetweenAnyDirection(10, 10);


        introControl.printOddNumbers(51);

    }
}

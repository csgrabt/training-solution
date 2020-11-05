package finalmodifier;

public class CircleCalculator {
    private double r;

    public static final double PI = 3.14;

    public CircleCalculator(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double calculatePerimeter (double r){
        return 2*r*PI;
    }
public double calculateArea (double r){
        return r*r*PI;
}

    public static void main(String[] args) {
        CircleCalculator circleCalculator = new CircleCalculator(2.0);

        System.out.println(circleCalculator.calculatePerimeter(circleCalculator.getR()));
    }





}

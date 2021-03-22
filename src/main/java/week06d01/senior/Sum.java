package week06d01.senior;

public class Sum {
    private final double sumOfPositive;
    private final double sumOfNegative;


    public Sum(double sumOfPositive, double sumOfNegative) {
        this.sumOfPositive = sumOfPositive;
        this.sumOfNegative = sumOfNegative;
    }

    public double getSumOfPositive() {
        return sumOfPositive;
    }

    public double getSumOfNegative() {
        return sumOfNegative;
    }

    @Override
    public String toString() {
        return "positive=" + sumOfPositive + "\n" +
                "negative=" + sumOfNegative
                ;
    }
}

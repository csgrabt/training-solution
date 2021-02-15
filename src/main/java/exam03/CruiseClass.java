package exam03;

public enum CruiseClass {
LUXURY(3.0), FIRST(1.8), SECOND(1.0);

    private double multiply;

    CruiseClass(double multiply) {
        this.multiply = multiply;
    }

    public double getMultiply() {
        return multiply;
    }
}

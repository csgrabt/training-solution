package nincsmegadvapackage;

public class Circle {
    public static final double PI = 3.14;

    private int diameter;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

public double area(){
return (double) (diameter/2)*(diameter/2)*PI;

}
public double kerulet(){
return diameter*PI;

}

}

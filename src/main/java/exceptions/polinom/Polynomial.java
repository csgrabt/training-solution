package exceptions.polinom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polynomial {

    private double[] coefficients;

    public Polynomial(double[] coefficients) {
     if (coefficients == null) {throw new NullPointerException("coefficients is null");}

        this.coefficients = coefficients;
    }

    public Polynomial(String[] coefficients) {
        if (coefficients == null) {throw new NullPointerException("coefficientStrs is null");}
        double[] coefficientsstr = new double[coefficients.length];
        try {
        for (int i = 0; i < coefficients.length; i++) {

                coefficientsstr[i] = Integer.parseInt(coefficients[i]);
            }
        }catch (NumberFormatException ex){throw new IllegalArgumentException("Illegal coefficients, not a number", ex);}
        this.coefficients = coefficientsstr;
    }

    public double[] getCoefficients() {
        return coefficients;
    }


    public double evaluate(double x) {

        double result = 0.0;

        for (int i = coefficients.length-1; i > -1; i--){
            result += coefficients[i]*Math.pow(x,(coefficients.length-1-i));
        }


        return result;
    }
}

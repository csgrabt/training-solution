package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Product {
    private String name;
    private BigDecimal unitWeight;
    private int numberOfDecimals = 2;

    public Product(String name, BigDecimal unitWeight, int numberOfDecimals) {
        this.name = name;
        this.unitWeight = unitWeight;
        this.numberOfDecimals = numberOfDecimals;
    }

    public Product(String name, BigDecimal unitWeight) {
        this.name = name;
        this.unitWeight = unitWeight;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitWeight() {
        return unitWeight;
    }

    public int getNumberOfDecimals() {
        return numberOfDecimals;
    }

    public BigDecimal totalWeight(int pieces){

        BigDecimal numberOD = new BigDecimal(String.valueOf(pieces));
        BigDecimal totalWeight = new BigDecimal(String.valueOf(numberOD.multiply(unitWeight))).setScale(numberOfDecimals, RoundingMode.HALF_UP);



        return totalWeight;
    }



}


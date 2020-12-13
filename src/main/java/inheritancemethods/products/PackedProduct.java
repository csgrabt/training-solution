package inheritancemethods.products;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PackedProduct extends Product{

    private int packingUnit;
    private BigDecimal weightOfBox;


    public PackedProduct(String name, BigDecimal unitWeight, int numberOfDecimals, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight, numberOfDecimals);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public PackedProduct(String name, BigDecimal unitWeight, int packingUnit, BigDecimal weightOfBox) {
        super(name, unitWeight);
        this.packingUnit = packingUnit;
        this.weightOfBox = weightOfBox;
    }

    public int getPackingUnit() {
        return packingUnit;
    }

    public BigDecimal getWeightOfBox() {
        return weightOfBox;
    }

    @Override
    public BigDecimal totalWeight(int pieces) {
        double g = (double)pieces/packingUnit;

        BigDecimal number = new BigDecimal(String.valueOf(g)).setScale(0, RoundingMode.CEILING);
        BigDecimal  totalWeight = new BigDecimal(String.valueOf(number.multiply(weightOfBox))).setScale(getNumberOfDecimals(), RoundingMode.HALF_UP);


        return super.totalWeight(pieces).add(totalWeight);

    }
}


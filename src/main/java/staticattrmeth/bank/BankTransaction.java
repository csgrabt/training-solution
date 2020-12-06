package staticattrmeth.bank;

import java.math.BigDecimal;

public class BankTransaction {

    private static final long MIN_TRX_VALUE = 1;
    private static final long MAX_TRX_VALUE = 10_000_000;
    private static long countTrx = 0;
    private static BigDecimal SumOfTrxs = new BigDecimal("0");
    private static long currentMinValue = MAX_TRX_VALUE;
    private static long currentMaxValue = MIN_TRX_VALUE;
    private long trxValue;

    public BankTransaction(long trxValue){
        if (trxValue > MAX_TRX_VALUE || trxValue < MIN_TRX_VALUE) {
            throw new IllegalArgumentException("This transaction cannot be excepted! " + trxValue);
        }
        if (trxValue > currentMaxValue){currentMaxValue = trxValue;}
        if (trxValue < currentMinValue){currentMinValue = trxValue;}
        countTrx++;
        SumOfTrxs = SumOfTrxs.add(new BigDecimal(Long.toString(trxValue)));
        this.trxValue = trxValue;
    }


    public static long getMinTrxValue() {
        return MIN_TRX_VALUE;
    }

    public static long getMaxTrxValue() {
        return MAX_TRX_VALUE;
    }

    public static long getCountTrx() {
        return countTrx;
    }

    public static BigDecimal getSumOfTrxs() {
        return SumOfTrxs;
    }

    public static long getCurrentMinValue() {
       if (countTrx == 0){return  0L;}

        return currentMinValue;
    }

    public static long getCurrentMaxValue() {
        if (countTrx == 0){return  0L;}
        return currentMaxValue;
    }

    public long getTrxValue() {
        return trxValue;
    }




    public static void initTheDay(){
        SumOfTrxs = new BigDecimal("0");
        countTrx = 0;
        currentMinValue = MAX_TRX_VALUE;
        currentMaxValue = MIN_TRX_VALUE;

    }


    public static BigDecimal averageOfTransaction(){

        return SumOfTrxs.divide(new BigDecimal(Long.toString(countTrx)));}






    // public BankTransaction(long trxValue){}











}

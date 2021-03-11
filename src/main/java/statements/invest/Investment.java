package statements.invest;

public class Investment {
    private double cost = 0.3;
    private int fund;
    private double interestRate;
    private boolean active = true;


    public Investment(int fund, double interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;

    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return fund * interestRate * days / (100.0 * 365);
    }


    public double close(int day) {
        double out = (fund + getYield(day)) * (100 - cost) / 100;
        double result = active ? out : 0;

        active = false;


        return result;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public void print() {
        System.out.println("Tőke: " + getFund());
        System.out.println(getYield(50));
        System.out.println(close(365));
        System.out.println(close(366));
    }

}



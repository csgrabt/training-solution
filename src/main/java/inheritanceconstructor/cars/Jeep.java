package inheritanceconstructor.cars;

public class Jeep extends Car{

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");}
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }


    public void modifyFuelAmount(double fuel){


    }





    // public double calculateRefillAmount() //kiszámolja, mennyit lehet tankolni








    public void drive(int km){

        if (fuleIsEnough(km));
    }
























    private boolean fuleIsEnough(int km) {
        double a = (super.getFuel() + extraFuel) - super.getFuelRate() * km / 100;
        return a > 0;


    }
}


package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;

    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }


    public void modifyFuelAmount(double fuel) {
        if (fuel < 0) {
            if ((extraFuel + fuel) < 0) {
                double a = extraFuel + fuel;

                super.modifyFuelAmount(a);
            }
        }
        if (super.calculateRefillAmount() >= fuel) {
            super.modifyFuelAmount(fuel);
        } else {
            if (fuel - super.calculateRefillAmount() > extraCapacity - extraFuel) {
                throw new IllegalArgumentException("Not enough fuel available!");
            }
            double tank = super.calculateRefillAmount();
            super.modifyFuelAmount(tank);
            this.extraFuel = extraFuel + (fuel - tank);
        }
    }


    public double calculateRefillAmount() {
        return 0.0;
    }


    public void drive(int km) {

        if (fuleIsEnough(km)) ;
    }


    private boolean fuleIsEnough(int km) {
        double a = (super.getFuel() + extraFuel) - super.getFuelRate() * km / 100;
        return a > 0;


    }
}


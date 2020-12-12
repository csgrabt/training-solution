package inheritanceconstructor.cars;

public class Car {
   private double fuelRate;
   private double fuel;
   private double tankCapacity;


    public Car(double fuelRate, double fuel, double tankCapacity) {
        if (fuel > tankCapacity){throw new IllegalArgumentException("Tank capacity is less than fuel!");}
        this.fuelRate = fuelRate;
        this.fuel = fuel;
        this.tankCapacity = tankCapacity;
    }

    public double getFuel() {
        return fuel;
    }


    public double getFuelRate() {
        return fuelRate;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void modifyFuelAmount(double fuel){
        this.fuel = this.fuel+fuel;
    }



    public void drive(int km){

      if (fuleIsEnough(km)){this.fuel = fuel - fuelRate*km/100;}else{throw new IllegalArgumentException("Not enough fuel available!");}

    }

     public double calculateRefillAmount(){

        return tankCapacity - fuel;
     }


private boolean fuleIsEnough(int km){
 double a = fuel - fuelRate*km/100;
    return a > 0 ;
}









}

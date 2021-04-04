package week07d05.junior;

public class Car extends Vehicle{


    public Car() {
    transmission = TransmissionType.AUTOMATIC;

    }


    public static void main(String[] args) {
        Car car = new Car();


        System.out.println(car.getNumberOfGears());

    }


}

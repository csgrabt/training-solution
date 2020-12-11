package week07d05;

public class Vehicle {
protected Enum<TransmissionType> transmission;
protected int numberOfGears;

    public Vehicle() {
        this.transmission = TransmissionType.MANUAL;
        this.numberOfGears = 5;
    }


    public Enum<TransmissionType> getTransmission() {
        return transmission;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }
}

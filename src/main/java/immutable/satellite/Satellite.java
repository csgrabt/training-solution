package immutable.satellite;

public class Satellite {

    public final CelestialCoordinates coordinates;
    private final String regNumber;

    public Satellite(CelestialCoordinates coordinates, String regNumber) {
        this.coordinates = coordinates;
        this.regNumber = regNumber;
    }

    public CelestialCoordinates getCoordinates() {
        return coordinates;
    }



    public String getRegNumber() {
        return regNumber;
    }



    public void modifyDestination(CelestialCoordinates celestialCoordinates) {
    }


    @Override
    public String toString() {
        return regNumber + ": " + coordinates.toString();
    }
}





package immutable.satellite;

public class Satellite {

    public  CelestialCoordinates coordinates;
    private final String regNumber;

    public Satellite(CelestialCoordinates coordinates, String regNumber) {
        if (regNumber.isEmpty()){throw new IllegalArgumentException("Register ident must not be empty!");}
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
    int x1 = celestialCoordinates.getX();
    int y1 = celestialCoordinates.getY();
    int z1 = celestialCoordinates.getY();

    int oldX = coordinates.getX();
    int oldY = coordinates.getY();
    int oldZ = coordinates.getZ();

    coordinates = new CelestialCoordinates(x1+oldX, y1+oldY, z1+oldZ);
    }


    @Override
    public String toString() {
        return regNumber + ": " + coordinates.toString();
    }



  //  private boolean isEmpty(String str){
   //     return str.isEmpty();
    //}


}





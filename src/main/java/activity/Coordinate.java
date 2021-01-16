package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;


    public Coordinate(double latitude, double longitude) {
        validator(latitude, longitude);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    private void validator(double x, double y) {
        if (!(x >= -90 && x <= 90)) {
            throw new IllegalArgumentException("The latitude is not valid");
        }
        if (!(y >= -180 && x <= 180)) {
            throw new IllegalArgumentException("The longitude is not valid");
        }

    }


}

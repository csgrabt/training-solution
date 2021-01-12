package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();


    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public void addTrackPoint(TrackPoint trackPoint) {

        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {
        double elevation = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation() < 0) {
                elevation += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();

            }


        }


        return Math.abs(elevation);
    }

    public double getFullDecrease() {
        double decrease = 0.0;
        for (int i = 1; i < trackPoints.size(); i++) {
            if (trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation() > 0) {
                decrease += trackPoints.get(i - 1).getElevation() - trackPoints.get(i).getElevation();
            }
        }

        return Math.abs(decrease);
    }

    public double getDistance() {
        TrackPoint trackPoint = trackPoints.get(0);
        double distance = 0.0;

        for (int i = 1; i < trackPoints.size(); i++) {
            distance += trackPoint.getDistanceFrom(trackPoints.get(i));

            trackPoint = trackPoints.get(i);
        }


        return distance;
    }

    public Coordinate findMinimumCoordinate() {
        double latmin = trackPoints.get(0).getCoordinate().getLatitude();
        double lonmin = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint point : trackPoints
        ) {
            if (point.getCoordinate().getLatitude() < latmin) {
                latmin = point.getCoordinate().getLatitude();
            }
            if (point.getCoordinate().getLongitude() < lonmin) {
                lonmin = point.getCoordinate().getLongitude();
            }
        }


        return new Coordinate(latmin, lonmin);
    }

    public Coordinate findMaximumCoordinate() {
        double latmax = trackPoints.get(0).getCoordinate().getLatitude();
        double lonmax = trackPoints.get(0).getCoordinate().getLongitude();

        for (TrackPoint point : trackPoints
        ) {
            if (point.getCoordinate().getLatitude() > latmax) {
                latmax = point.getCoordinate().getLatitude();
            }
            if (point.getCoordinate().getLongitude() > lonmax) {
                lonmax = point.getCoordinate().getLongitude();
            }
        }

        return new Coordinate(latmax, lonmax);
    }


 /*   public double getRectangleArea() {
        TrackPoint trackPoint1 = new TrackPoint(findMaximumCoordinate(), 0);
        TrackPoint trackPoint2 = new TrackPoint(findMinimumCoordinate(), 0);
        TrackPoint trackPoint3 = new TrackPoint(new Coordinate(trackPoint2.getCoordinate().getLatitude(), trackPoint1.getCoordinate().getLongitude()), 0);

        double a = trackPoint1.getDistanceFrom(trackPoint3);
        double b = trackPoint2.getDistanceFrom(trackPoint3);

        return a*b;
    }*/

    public double getRectangleArea() {
        Coordinate coordinate = findMaximumCoordinate();
        Coordinate coordinate2 = findMinimumCoordinate();


        double a = coordinate.getLatitude() - coordinate2.getLatitude();
        double b = coordinate.getLongitude() - coordinate2.getLongitude();

        return a * b;
    }


}

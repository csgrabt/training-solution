package interfaceextends.robot;

import java.util.List;

public class AstroBoy implements FlyableRobot {

    private Point position;
    private int angle;
    private List<Point> path;
    private final long ALTITUDE = 5;

    public AstroBoy(Point position, int angle, List<Point> path) {
        this.position = position;
        this.angle = angle;
        this.path = path;
    }









    @Override
    public void liftTo(long altitude) {
       long z =  position.getZ() + altitude;

    }

    @Override
    public void moveTo(Point position) {

    }

    @Override
    public void fastMoveTo(Point position) {

    }

    @Override
    public void rotate(int angle) {

    }

    @Override
    public List<Point> getPath() {
        return null;
    }
}

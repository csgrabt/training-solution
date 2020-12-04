package methodpass.troopers;

public class Position {
    private final double posX;
    private final double posY;

    public Position(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }


    public double distanceFrom(Position pos2) {

        double d = Math.pow(((getPosX()-pos2.posX)*(getPosX()-pos2.posX) + (getPosY()-pos2.getPosY())*(getPosY()-pos2.getPosY())),(0.5));


        return d;
    }
}

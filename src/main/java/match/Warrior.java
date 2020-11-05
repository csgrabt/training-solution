package match;

import java.util.Random;

public class Warrior {
    private String name;
    private int stamina;
    private double skill;
    private Point position;

    Random rnd = new Random();

    public Warrior(String name, Point position) {
        this.name = name;
        this.stamina = rnd.nextInt(81)+20;
        this.skill = rnd.nextDouble();
        this.position = position;
    }

    public int getStamina() {
        return stamina;
    }

    public String getName() {
        return name;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public Point getPosition() {
        return position;
    }

    public void attack(Warrior other){
        double a = rnd.nextDouble();
        if (a < skill){
            int b = rnd.nextInt(3)+1;
            int c = other.getStamina() - b;
            other.setStamina(c);

        }

    }

    public boolean isAlive(){
        return 0 < stamina;
    }

    public String toString(){
        return "név: " + name + "(" + getPosition().getX() + ","+ getPosition().getY() +")" + stamina;
    }




    public void move(Warrior other) {
        if (!(position.getX() == other.getPosition().getX() && position.getY() == other.getPosition().getY())) {
            if (position.getY() == other.getPosition().getY()) {
                if (position.getX() < other.getPosition().getX()) {
                    position = new Point(position.getX() + 1, position.getY());
                } else {
                    position = new Point(position.getX() - 1, position.getY());
                }
            } else {
                if (position.getX() == other.getPosition().getX()) {
                    if (position.getY() < other.getPosition().getY()) {
                        position = new Point(position.getX(), position.getY() + 1);
                    } else {
                        position = new Point(position.getX(), position.getY() - 1);


                    }
                } else {
                    if (position.getX() < other.getPosition().getX() && position.getY() < other.getPosition().getY()) {
                        position = new Point(position.getX() + 1, position.getY() + 1);
                    } else {
                        if (position.getX() > other.getPosition().getX() && position.getY() > other.getPosition().getY()) {
                            position = new Point(position.getX() - 1, position.getY() - 1);
                        } else {
                            if (position.getX() < other.getPosition().getX() && position.getY() > other.getPosition().getY()) {
                                position = new Point(position.getX() + 1, position.getY() - 1);
                            } else {
                                position = new Point(position.getX() - 1, position.getY() + 1);
                            }
                        }


                    }
                }

            }
        }
    }
public double distance(Warrior other){
       return position.distance(other.getPosition());


}









}






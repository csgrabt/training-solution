package match;

public class GameMain {


    public static void main(String[] args) {
        Warrior w1 = new Warrior("Ookami", new Point(-10, 1));
        Warrior w2 = new Warrior("huri", new Point(1,  10));


        System.out.println(w1.toString());
        System.out.println(w2.toString());

if (Math.abs((w1.getStamina())- w2.getStamina()) > 30){
    System.out.println("You are too WEEK go away");
}else {


    while (w1.getPosition().getX() != w2.getPosition().getX() || w1.getPosition().getY() != w2.getPosition().getY()) {
        w1.move(w2);
        w2.move(w1);
        System.out.println(w1.toString() + " " + w2.toString());
    }

    System.out.println("ATTACK");

    while (w1.isAlive() && w2.isAlive()) {
        w1.attack(w2);
        w2.attack(w1);
        System.out.println(w1.getStamina() + " " + w2.getStamina());

    }

    if (w1.isAlive()) {
        System.out.println(w1.getName() + " is the Winner");
    } else {
        System.out.println(w2.getName() + " is the Winner");
    }

}









    }

}

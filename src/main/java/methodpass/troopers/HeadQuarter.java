package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {

    private List<Trooper> troopers = new ArrayList<>();





    public List<Trooper> getTroopers() {
        return troopers;
    }

    public void addTrooper(Trooper trooper) {
    troopers.add(trooper);

    }

    public void moveTrooperByName(String name, Position position) {

        for (Trooper n:troopers)
        { if (n.getName().equals(name)){n.changePosition(position);}

        }
    }

    public void moveClosestTrooper(Position position) {

    findClosestTrooper(position).changePosition(position);
    }



private Trooper findClosestTrooper(Position position){
        double distance = troopers.get(0).distanceFrom(position);
        Trooper s = troopers.get(0);
    for (Trooper n: troopers)
          { if (n.getPosition().distanceFrom(position) < distance){
              distance = n.getPosition().distanceFrom(position);
              s = n;}


          }

return s;
}




}

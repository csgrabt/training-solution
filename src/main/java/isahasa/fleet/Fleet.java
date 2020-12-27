package isahasa.fleet;

import java.util.ArrayList;
import java.util.List;

public class Fleet {

private List<Ship> ships = new ArrayList<>();
private int waitingPersons;
private int waitingCargo;


    public Fleet(List<Ship> ships) {
        this.ships = ships;
        this.waitingPersons = 0;
        this.waitingCargo = 0;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public int getWaitingPersons() {
        return waitingPersons;
    }

    public int getWaitingCargo() {
        return waitingCargo;
    }

public void loadShip(int cargo, int numberOfPersons){
    int remainingPersons = numberOfPersons;
    int remainingCargo = cargo;

    for (Ship ship: ships) {
        if (ship instanceof CanCarryPassengers) {
            if(remainingPersons != 0) {
                remainingPersons = ((CanCarryPassengers) ship).loadPassenger(remainingPersons);
            }
        }
        if (ship instanceof CanCarryGoods) {
            if (remainingCargo != 0) {
                remainingCargo = ((CanCarryGoods) ship).loadCargo(remainingCargo);
            }
        }
    }

    waitingPersons = remainingPersons;
    waitingCargo = remainingCargo;



}







}

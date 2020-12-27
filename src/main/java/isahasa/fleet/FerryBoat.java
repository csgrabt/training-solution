package isahasa.fleet;

public class FerryBoat implements Ship, CanCarryGoods, CanCarryPassengers {

    private CanCarryPassengers canCarryPassengers;
    private CanCarryGoods canCarryGoods;



    public FerryBoat(int maxCargo, int maxPassenger) {
        canCarryGoods = new CanCarryGoodsBehaviour(0, maxCargo);
        canCarryPassengers = new CanCarryPassengersBehaviour(0, maxPassenger);
    }


    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }


    @Override
    public int loadCargo(int cargoWeight) {
        return canCarryGoods.loadCargo(cargoWeight);
    }

    @Override
    public int getCargoWeight() {
        return canCarryGoods.getCargoWeight();
    }
}
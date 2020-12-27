package isahasa.fleet;

public class CanCarryGoodsBehaviour implements CanCarryGoods{
    private int cargoWeight;
    private int maxCargoWeight;

    public CanCarryGoodsBehaviour(int cargoWeight, int maxCargoWeight) {
        this.cargoWeight = cargoWeight;
        this.maxCargoWeight = maxCargoWeight;
    }

    public int getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public int loadCargo(int cargoWeight) {
     int freeSpace =  maxCargoWeight - (this.cargoWeight);
    int dontCargo = 0;
     if (freeSpace > cargoWeight){
         this.cargoWeight +=cargoWeight;

     } else {
         dontCargo = cargoWeight - freeSpace;
         this.cargoWeight = this.maxCargoWeight;
     }

     return dontCargo;}

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }
}

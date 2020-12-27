package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers{

    private int passengers;
    private int maxPassengers;

    public CanCarryPassengersBehaviour(int passengers, int maxPassengers) {
        this.passengers = passengers;
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int freeSeat =  maxPassengers - (this.passengers);
        int dontHasASeat = 0;
        if (freeSeat > passengers){
            this.passengers +=passengers;

        } else {
           dontHasASeat = passengers - freeSeat;
            this.passengers = this.maxPassengers;
        }

        return dontHasASeat;}


    @Override
    public int getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }
}

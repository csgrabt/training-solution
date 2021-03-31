package week08d01.senior;

public class Cell {

    private StateOfTheDoor state= StateOfTheDoor.CLOSE;


    public void setState() {
        if (state.equals(StateOfTheDoor.CLOSE)) {
            state = StateOfTheDoor.OPEN;
            return;
        }
        state = StateOfTheDoor.CLOSE;
    }

    public StateOfTheDoor getState() {
        return state;
    }

    @Override
    public String toString() {
        return state.toString();
    }
}

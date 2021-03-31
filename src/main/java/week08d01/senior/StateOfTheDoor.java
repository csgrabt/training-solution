package week08d01.senior;

public enum StateOfTheDoor {
    OPEN("The door is open"), CLOSE("The door is close");

    private final String state;

    StateOfTheDoor(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return getState();
    }
}

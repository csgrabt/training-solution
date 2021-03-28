package week06d05.senior;

public class Bottle {
    private final BottleType bottleType;
    private int filledUntil;

    public BottleType getBottleType() {
        return bottleType;
    }

    public int getFilledUntil() {
        return filledUntil;
    }

    public Bottle(BottleType bottleType, int filledUntil) {
        this.bottleType = bottleType;
        this.filledUntil = filledUntil;
    }


    public void fill(int fillAmount) {
        if (getFilledUntil() == bottleType.getMaximumAmount()) {
            throw new IllegalArgumentException("The bottle is full!");
        }
        if (getFilledUntil() + fillAmount > getBottleType().getMaximumAmount()) {
            throw new IllegalArgumentException("There is no enough space in the Bottle!");
        }

        this.filledUntil += fillAmount;

    }

    public static Bottle of(BottleType bottleType){
        return new Bottle(bottleType, 0);
    }

}

package week06d05;

public class Biscuit {

    private final BiscuitType type;
    private final int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        if (type == null) {
            throw new IllegalArgumentException("Type cannot be null!");
        }
        if (gramAmount < 0) {
            throw new IllegalArgumentException("Amount is less than Zero!");
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }

    public BiscuitType getType() {
        return type;
    }

    public int getGramAmount() {
        return gramAmount;
    }

    public static Biscuit of(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }

    public String toString() {
        return "Type: " + type + ", amount: " + gramAmount + " gr";
    }

}




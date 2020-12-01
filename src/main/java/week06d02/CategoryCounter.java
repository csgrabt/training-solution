package week06d02;

public class CategoryCounter {

    private String type;
    private int pieces;

    public CategoryCounter(String type, int pieces) {
        this.type = type;
        this.pieces = pieces;
    }

    public String getType() {
        return type;
    }

    public int getPieces() {
        return pieces;
    }
}

package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");

    private int valeu;
    private String description;

    MarkType(int valeu, String description) {
        this.valeu = valeu;
        this.description = description;
    }

    public int getValeu() {
        return valeu;
    }

    public String getDescription() {
        return description;
    }
}

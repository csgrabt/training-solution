package week07d04;

public enum KESZ {
TRUE("kész"), FALSE("nincs kész");

private String description;


    KESZ(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {

        return getDescription();
    }
}

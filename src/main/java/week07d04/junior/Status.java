package week07d04.junior;

public enum Status {
    TRUE("kész"), FALSE("nincs kész");

    private final String description;


    Status(String description) {
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

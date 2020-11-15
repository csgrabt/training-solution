package sttringbuilder;

public enum Title {
    MR("Mr"),
    MS("Ms"),
    DR("Dr"),
    PROF("Prof");

private String values;

    Title(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }
}

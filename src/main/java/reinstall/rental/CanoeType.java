package reinstall.rental;

public enum CanoeType {
    Red(1.0), Green(1.2), Blue(1.5);

    private double factor;

    CanoeType(Double factor) {
        this.factor = factor;

    }

    public double getFactor() {
        return factor;
    }
}


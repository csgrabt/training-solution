package gyakorlas2;

import java.util.Objects;

public class Trainer {

    private String name;


    public Trainer(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                '}';
    }


    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trainer)) return false;
        Trainer trainer = (Trainer) o;
        return Objects.equals(name, trainer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

package gyakorlasLambda;

import java.util.List;

@FunctionalInterface
public interface Condition {
    boolean test(Employee employee);
}

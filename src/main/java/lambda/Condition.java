package lambda;

@FunctionalInterface
public interface Condition {

    boolean test(Employee employee);

}

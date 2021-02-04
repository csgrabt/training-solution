package gyakorlas2;

public class Trainer2 implements Comparable<Trainer2>{
    private String name;
    private int salary;

    public Trainer2(String name, int salary) {
        this.name = name;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Trainer2 o) {
        return this.name.compareTo(o.name);
   // return this.salary-o.salary;
    }

    @Override
    public String toString() {
        return "Trainer2{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

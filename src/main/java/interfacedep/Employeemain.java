package interfacedep;

public class Employeemain {
    public static void main(String[] args) {
        Employee employee = new Employee(10_000, new PercentBonusCalculator());







        Employee employee2 = new Employee(10_000, new FixedBonusCalculator());
        System.out.println(employee2.getBonus());

    }


}

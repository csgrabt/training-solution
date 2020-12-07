package introinheritance.employee;

import java.util.Objects;

public class BigBoss extends Boss {

private double bonus;


    public BigBoss(String name, String address, double salary, int numberOfEmployees, double bonus) {
        super(name, address, salary, numberOfEmployees);
        this.bonus = bonus;
    }


    public double getBonus() {
        return bonus;
    }

    public int getNumberOfEmployees(){
        return super.getNumberOfEmployees();

    }

    public double getSalary(){

        return super.getSalary() + bonus;
    }



}

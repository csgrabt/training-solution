package stringconcat.employee;

public class Employee {
    private String name;
    private String job;
    private int salary;

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, String job, int salary) {
        if (name == null ){throw new IllegalArgumentException("Name must not be empty.");}
        if (name.equals("")){throw new IllegalArgumentException("Name must not be empty.");}
        if (salary% 1000 > 0){throw new IllegalArgumentException("Name must not be empty.");}
        if (salary < 0){throw new IllegalArgumentException("Salary must be positive.");}
        if (job == null ){throw new IllegalArgumentException("Job must not be empty.");}
        if (job.equals("")){throw new IllegalArgumentException("Job must not be empty.");}

        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    @Override
    public String toString() {


        return
                name + " - " + job + " - " +
                 salary +" Ft"
                ;
    }



    }





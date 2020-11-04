package debug;

import java.util.ArrayList;
import java.util.List;


public class Company {

    private List<Employee> lista;

    public Company(List<Employee> lista) {
        this.lista = lista;
    }

    public void addEmployee(Employee a){
        lista.add(a);
    }

    public Employee findEmployeeByName(String name){
        for (Employee employee : lista) {
            if (employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }
public List<String>  listEmployeeNames(){
        List<String> listOfName = new ArrayList<>();
    for (Employee employee: lista) {
        listOfName.add(employee.getName());
        System.out.println(employee);}
        return listOfName;
    }












}


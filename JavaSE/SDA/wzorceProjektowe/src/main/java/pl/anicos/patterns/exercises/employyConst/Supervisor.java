package pl.anicos.patterns.exercises.employyConst;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Employee {

    public Supervisor(String name, int salary) {
        super(name, salary);
    }

    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double getAllCast(){
        int result = getSalary();
        return  employees.stream().map(Employee::getSalary).count();

    }

}

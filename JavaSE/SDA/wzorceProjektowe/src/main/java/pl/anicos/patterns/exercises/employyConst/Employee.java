package pl.anicos.patterns.exercises.employyConst;

public class Employee {
    private final String name;

    private final int salary;
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


}

package studentsList;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private double avgGrade;
    private long indexNumber;
    private long pesel;

    public Student(int id, String name, String lastName, double avgGrade, long indexNumber, long pesel) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.avgGrade = avgGrade;
        this.indexNumber = indexNumber;
        this.pesel = pesel;
    }


    public String getLastName() {
        return lastName;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public long getIndexNumber() {
        return indexNumber;
    }

    public long getPesel() {
        return pesel;
    }
}

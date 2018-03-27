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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public long getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(long indexNumber) {
        this.indexNumber = indexNumber;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", avgGrade=" + avgGrade +
                ", indexNumber=" + indexNumber +
                ", pesel=" + pesel +
                '}';
    }
}

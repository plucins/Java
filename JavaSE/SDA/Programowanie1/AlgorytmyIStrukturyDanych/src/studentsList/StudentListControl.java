package studentsList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentListControl {
    private List<Student> studentList = new ArrayList<>();

    public void addStudentToList(int id, String name, String lastName, double avgGrade, long indexNumber, long pesel ){
        this.studentList.add(new Student(id,name,lastName,avgGrade,indexNumber,pesel));
    }

    public void sortedByAdded(){
        studentList.stream().forEach(System.out::println);
    }

    public void sortedByLastName(){
        studentList.stream().sorted(Comparator.comparing(Student::getLastName))
                .forEach(System.out::println);
    }

    public void sortedByAvgGrade(){
        studentList.stream().sorted(Comparator.comparing(Student::getAvgGrade))
                .forEach(System.out::println);
    }

    public void sortedByIndexNumber(){
        studentList.stream().sorted(Comparator.comparing(Student::getIndexNumber))
                .forEach(System.out::println);
    }

    public void sortedByPesel(){
        studentList.stream().sorted(Comparator.comparing(Student::getPesel))
                .forEach(System.out::println);
    }
}

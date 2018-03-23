package Zadanie1mapy;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(1234L,"Jan","Jankowski");
        university.addStudent(2234L,"Kowal","Kowalski");
        university.addStudent(3234L,"Piotr","Piotrowski");


        System.out.println(university.containsStudent(1234L));
        System.out.println(university.getStudent(3234L));
        university.printAllStudents();
        System.out.println(university.studentsCount());
    }
}

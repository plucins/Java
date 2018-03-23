package Zadanie1mapy;


import java.util.Map;

public class University {
    Map<Long,Student> studentMap;


    public void addStudent(long indexNumber, String name, String lastName){
        this.studentMap.put(indexNumber,new Student(indexNumber,name,lastName));
    }

    boolean containsStudent(long indexNumber){
        return studentMap.containsKey(indexNumber);
    }

    Student getStudent(long indexNumber) throws NoSuchStudentException{
        return studentMap.get(indexNumber);
    }

    int studentsCount(){
        return studentMap.size();
    }

    void printAllStudents(){
        System.out.println(studentMap.values());
    }
}

package Zadanie5;

import java.util.ArrayList;
import java.util.List;

public class Dziennik {
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void dodajStudenta(Student strudent){
        studentList.add(strudent);
    }

    public void usunStudenta(Student student){
        studentList.remove(student);
    }

    public Student zwrocStudenta(int i){
        return studentList.get(i);
    }

    public double podajSredniaStudenta(long numerIndeksu){
        Student poszukiwanyStudent = null;
        for(Student s: studentList){
            if(s.getNumerIndeksu() == numerIndeksu){
                poszukiwanyStudent = s;
            }
        }
        double suma = 0;
        for(Double ocena: poszukiwanyStudent.getListaOcen()){
            suma += ocena;
        }
        return suma/poszukiwanyStudent.getListaOcen().size();
    }

    public List<Student> podajStudentowZagrozonych(){
        List<Student> listaZagrozonych = new ArrayList<>();
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getListaOcen().contains(2)){
                listaZagrozonych.add(studentList.get(i));
            }
        }
        return listaZagrozonych;
    }
}

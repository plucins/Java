package struktury.studentsList;

public class Main {
    public static void main(String[] args) {
        StudentListControl s = new StudentListControl();

        s.addStudentToList(1,"Adam","Adamowicz",4.3,12345L,123456L);
        s.addStudentToList(2,"Jan","Jankowski",2.3,45678L,43321L);
        s.addStudentToList(3,"Piotr","Piotrkowski",4.1,6543L,9876L);
        s.addStudentToList(4,"Bartosz","Bartłomiej",5.0,15545L,124567L);
        s.addStudentToList(5,"Tomasz","Tomkowski",3.7,12366L,1266456L);
        s.addStudentToList(6,"Mateusz","Mteuszowicz",2.3,1145L,111456L);



        s.sortedByAdded();
        s.sortedByIndexNumber();
    }
}

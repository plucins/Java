package Zadanie1mapy;

public class NoSuchStudentException extends RuntimeException {
    public NoSuchStudentException() {
        System.err.println("Student NOT found");
    }
}

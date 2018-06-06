package example.control;

import example.DatabaseConnectionProvider;
import example.entity.Student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by krzysztof on 14.12.17.
 */
public class StudentDAO {

    Connection connection;

    {
        try {
            connection = DatabaseConnectionProvider.getConnection();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * TODO: zad. 1 - Uzupelnij implementacje tak, aby metoda zwracała wszystkich studentów w bazie
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.testGetAllStudents
     */
    public List<Student> getAllStudents() throws IOException, SQLException {
        List<Student> students = new ArrayList<>();
        PreparedStatement getAll = connection.prepareStatement("SELECT * FROM student");

        ResultSet rs = getAll.executeQuery();

        while (rs.next()) {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCity(rs.getString("city"));
            student.setPassword(rs.getString("password"));
            student.setBirthday(rs.getDate("birthday").toLocalDate());
            student.setAverageGrade(rs.getDouble("averagegrade"));
            students.add(student);
        }

        return students;
    }

    /**
     * TODO: zad. 2 - Uzupelnij implementacje tak, aby metoda zwracała studenta o zadanym Id
     * lub pustego Optionala jeśli student o zadanym id nie istnieje w bazie
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.testGetStudentById
     * Uwaga: w implementacji można wykorzystać:
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html#first--">resultSet#first()</a>
     * lub
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/ResultSet.html#next--">resultSet#next()</a>
     **/
    public Optional<Student> findStudentById(Integer id) throws IOException, SQLException {

        PreparedStatement getById = connection.prepareStatement("SELECT * FROM student WHERE id = ?");
        getById.setInt(1, id);
        ResultSet rs = getById.executeQuery();
        Student student = null;

        if (rs.next()) {
            student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCity(rs.getString("city"));
            student.setPassword(rs.getString("password"));
            student.setBirthday(rs.getDate("birthday").toLocalDate());
            student.setAverageGrade(rs.getDouble("averagegrade"));
        }

        if (student != null) {
            return Optional.of(student);
        }

        return Optional.empty();

    }

    /**
     * TODO: zad. 3 - Uzupelnij implementacje tak, aby metoda zwracała studenta o zadanym name i password
     * lub pustego Optionala jeśli taki student nie istnieje w bazie
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.testFindStudentByNameAndPassword
     **/
    public Optional<Student> findStudentByNameAndPassword(String name, String password) throws IOException, SQLException {
        PreparedStatement findByUsernameAndPassword = connection.prepareStatement("SELECT * FROM student WHERE name = ? and password = ?");
        findByUsernameAndPassword.setString(1, name);
        findByUsernameAndPassword.setString(2, password);

        ResultSet rs = findByUsernameAndPassword.executeQuery();
        Student student = new Student();

        if (rs.next()) {
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCity(rs.getString("city"));
            student.setPassword(rs.getString("password"));
            student.setBirthday(rs.getDate("birthday").toLocalDate());
            student.setAverageGrade(rs.getDouble("averagegrade"));
        }
        return Optional.ofNullable(student);
    }

    /**
     * TODO: zad. 4 - Uzupelnij implementacje tak, aby metoda zapisywala studenta do bazy
     * Uwaga: Nie zapisujemy pola id - jest ono generowane automatycznie przez bazę
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.saveStudentTest
     **/
    public void saveStudent(Student student) throws IOException, SQLException {
        PreparedStatement insertStudent = connection.prepareStatement("INSERT INTO student VALUES (?,?,?,?,?,?) ");
        insertStudent.setInt(1, student.getId());
        insertStudent.setString(2, student.getName());
        insertStudent.setString(3, student.getCity());
        insertStudent.setString(4, student.getPassword());
        insertStudent.setDate(5, Date.valueOf(student.getBirthday()));
        insertStudent.setDouble(6, student.getAverageGrade());
        insertStudent.executeUpdate();
    }

    /**
     * TODO: zad. 5 - Uzupelnij implementacje tak, aby metoda zapisywala wszystkich stuentów studenta do bazy
     * Uwaga: Nie zapisujemy pola id - jest ono generowane automatycznie przez bazę
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.saveAllStudentTest
     * Implementację można oprzeć na
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/PreparedStatement.html#addBatch--">PreparedStatement#addBatch</a>
     * lub ewentualnie metodzie {@link StudentDAO#saveStudent(Student)}
     **/
    public void saveAllStudents(List<Student> students) throws IOException, SQLException {
        for (Student s : students) {
            saveStudent(s);
        }
    }

    /**
     * TODO: zad. 6 - Uzupelnij implementacje tak, aby metoda zmieniala średnią ocenę studenta o zadanym id i zwracała ilość zaktaulizowanych
     * rekordów w bazie (Studentów)
     * Uwaga: Należy skorzystać z wartości zwracanej przez metodę
     *
     * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/sql/PreparedStatement.html#executeUpdate--">PreparedStatement#addBatch</a>
     * <p>
     * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.testUpdateAverageGrade
     **/
    public int changeStudentAverageGrade(Integer studentId, Double newAverageGrade) throws IOException, SQLException {
        PreparedStatement updateStudentAvarageGrade = connection.prepareStatement("UPDATE student SET averagegrade = ? where id = ? ");
        updateStudentAvarageGrade.setDouble(1, newAverageGrade);
        updateStudentAvarageGrade.setInt(2, studentId);

        return updateStudentAvarageGrade.executeUpdate();
    }

    /**
     * TODO: zad. 6.1 - Uzupelnij implementacje tak, aby metoda działała identycznie jak {@link StudentDAO#changeStudentAverageGrade(Integer, Double)}
     * z tą różnicą że na połączeniu ({@link Connection}) przyjmowanym z zewnątrz
     **/
    public int changeStudentAverageGrade(Integer studentId, double asDouble, Connection connection) throws SQLException {
        PreparedStatement updateStudentAvarageGrade = connection.prepareStatement("UPDATE student SET averagegrade = ? where id = ? ");
        updateStudentAvarageGrade.setDouble(1, asDouble);
        updateStudentAvarageGrade.setInt(2, studentId);

        return updateStudentAvarageGrade.executeUpdate();
    }

    /**
     * TODO zad. 7 - Uzupełnij implementacje tak aby metoda aktualizowała studenta w bazie o zadanym id wartosciami przekazanymi w obiekcie newStudent
     * Metoda powinna zwracac ilosc zaktualizowanych wierszy
     * Uwaga: nie aktualizuje pola id
     * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.testUpdateStudent
     **/
    public int updateStudent(Integer studentId, Student newStudent) throws IOException, SQLException {
        PreparedStatement updateStudent = connection.prepareStatement("UPDATE student SET name=?,city=?,password=?,birthday=?,averagegrade=? WHERE id = ?");
        updateStudent.setString(1, newStudent.getName());
        updateStudent.setString(2, newStudent.getCity());
        updateStudent.setString(3, newStudent.getPassword());
        updateStudent.setDate(4, Date.valueOf(newStudent.getBirthday()));
        updateStudent.setDouble(5, newStudent.getAverageGrade());
        updateStudent.setInt(6, studentId);

        return updateStudent.executeUpdate();
    }

    /**
     * TODO zad. 8 - Uzupełnij implementacje tak aby metoda usuwała studenta o zadanym id z bazy
     * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentDAOTest.removeStudentTest
     */
    public int removeStudent(Integer studentId) throws IOException, SQLException {
        PreparedStatement removeStudent = connection.prepareStatement("DELETE FROM student WHERE id = ?");
        removeStudent.setInt(1, studentId);

        return removeStudent.executeUpdate();
    }


/*
        Connection connection = DatabaseConnectionProvider.getConnection();
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("SELECT * FROM student where name = " + name + " AND password = " + password);
 */

}

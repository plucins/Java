package example.control;

import example.DatabaseConnectionProvider;
import example.entity.StudentGrade;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by krzysztof on 14.12.17.
 */
public class StudentGradeDAO {

    Connection connection;

    {
        try {
            connection = DatabaseConnectionProvider.getConnection();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * TODO zad. 9 - Uzupełnij implementacje tak aby metoda zapisywała ocene studenta do bazy i zwracala ilosc dodanych rekordow
     * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentGradeDAOTest.saveStudentGradeTest
     */
    public int saveStudentGrade(StudentGrade studentGrade) throws IOException, SQLException {
        PreparedStatement saveStudentGrade = connection.prepareStatement("INSERT INTO studentgrade (value,date,studentid) VALUES (?,?,?)");
        saveStudentGrade.setDouble(1, studentGrade.getValue());
        saveStudentGrade.setDate(2, Date.valueOf(studentGrade.getDate()));
        saveStudentGrade.setInt(3, studentGrade.getStudentId());

        return saveStudentGrade.executeUpdate();
    }


    /**
     * TODO zad. 9.1 - Uzupełnij implementacje tak aby metoda robiła to co w zad 9 ale na połączeniu otrzymywanym jako parametr
     */
    public int saveStudentGrade(StudentGrade studentGrade, Connection connection) throws IOException, SQLException {
        PreparedStatement saveStudentGrade = connection.prepareStatement("INSERT INTO studentgrade VALUES (?,?,?,?)");
        saveStudentGrade.setInt(1, studentGrade.getId());
        saveStudentGrade.setDouble(2, studentGrade.getValue());
        saveStudentGrade.setDate(3, Date.valueOf(studentGrade.getDate()));
        saveStudentGrade.setInt(4, studentGrade.getStudentId());

        return saveStudentGrade.executeUpdate();
    }

    /**
     * TODO zad. 10 - Uzupełnij implementacje tak aby metoda zwracała wszystkie oceny stuenta o zadanym id
     * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentGradeDAOTest.getAllStudentGradesTest
     */
    public List<StudentGrade> getAllGradesByStudentId(Integer studentId) throws IOException, SQLException {
        return getAllGradesByStudentId(studentId, connection);
    }

    /**
     * TODO zad. 10.1 - Uzupełnij implementacje tak aby metoda robiła to co w zad 10 ale na połączeniu otrzymywanym jako parametr
     */
    public List<StudentGrade> getAllGradesByStudentId(Integer studentId, Connection connection) throws SQLException {
        List<StudentGrade> grades = new ArrayList<>();
        PreparedStatement getAllGrades = connection.prepareStatement("SELECT * FROM studentgrade WHERE studentid = ?");
        getAllGrades.setInt(1, studentId);

        ResultSet rs = getAllGrades.executeQuery();
        while (rs.next()) {
            StudentGrade studentGrade = new StudentGrade(
                    rs.getInt("studentgrade.id"),
                    rs.getInt("studentId"),
                    rs.getInt("value"),
                    rs.getDate("date").toLocalDate()
            );
            grades.add(studentGrade);
        }
        return grades;
    }


    /**
     * TODO zad. 11 - Uzupełnij implementacje tak aby metoda zwracala oceny wszystkich studentów z zadanego miasta
     * * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentGradeDAOTest.getAllStudentGradesFromGdanskTest
     */
    public List<StudentGrade> getAllStudentGradesFromCity(String city) throws IOException, SQLException {
        List<StudentGrade> studentGrades = new ArrayList<>();
        PreparedStatement getAllStudentGradesFromCity = connection.prepareStatement("select *  FROM studentgrade left outer join student on student.id = studentgrade.studentid WHERE student.city = ? ");
        getAllStudentGradesFromCity.setString(1,city);
        ResultSet rs = getAllStudentGradesFromCity.executeQuery();

        while (rs.next()) {
            StudentGrade studentGrade = new StudentGrade(
                    rs.getInt("studentgrade.id"),
                    rs.getInt("studentId"),
                    rs.getInt((int) rs.getDouble("value")),
                    rs.getDate("date").toLocalDate()
            );
            studentGrades.add(studentGrade);
        }

        return studentGrades;
    }

    /**
     * TODO zad. 12 - Uzupełnij implementacje tak aby metoda zwracala srednia ocene studentów z zadanego miasta
     * * * Po zaimplementowaniu sukcesem powinien konczyc sie test example.control.StudentGradeDAOTest.getAverageStudentGradeFromGdansk
     * Uwaga: W implementacji nalezy wykorzystać funkcje sql avg oraz AS
     * * @see <https://www.w3schools.com/sql/sql_count_avg_sum.asp">AVG</a>
     */
    public Optional<Double> getAverageStudentGradeFromCity(String city) throws IOException, SQLException {
        PreparedStatement getAvg = connection.prepareStatement("select avg(value) as Srednia FROM studentgrade \n" +
                "left outer join student on student.id = studentgrade.studentid WHERE student.city = ?; ");
        getAvg.setString(1,city);

        ResultSet rs = getAvg.executeQuery();
        rs.next();
        Double result = rs.getDouble("Srednia");

        return Optional.of(result);

    }

}

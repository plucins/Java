package repo;


import fields.Director;
import mapper.DirectorMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.Month;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class DirectorRepositoryTest {

    @Mock
    Connection connection;

    @Mock
    PreparedStatement preparedStatement;

    @Mock
    ResultSet resultSet;

    @Mock
    DirectorMapper directorMapper;

    Director director;
    @Before
    public void setup() throws Exception {
        when(connection.prepareStatement(any(String.class),anyInt())).thenReturn(preparedStatement);

        director = new Director();
        director.setId(1);
        director.setDirectorDayOfBirth(LocalDate.of(1993, Month.JANUARY, 1));
        director.setDirectorBiography("bio");
        director.setDirectorName("Name");
        director.setIdTvSeries(2);

        when(resultSet.getInt(1)).thenReturn(1);
        when(resultSet.getString(2)).thenReturn(director.getDirectorName());
        when(resultSet.getDate(3)).thenReturn(Date.valueOf(director.getDirectorDayOfBirth()));
        when(resultSet.getString(4)).thenReturn(director.getDirectorBiography());
        when(preparedStatement.executeQuery()).thenReturn(resultSet);


    }

    @Test
    public void create(){
        new DirectorRepository(connection).add(director);
    }

    @Test (expected = NullPointerException.class)
    public void create_nullPassed(){
        new DirectorRepository(connection).add(null);
    }

    @Test
    public void remove() throws Exception{
        //doNothing().when()
        //new DirectorRepository(connection).remove(director);

        director.setDirectorName("Adam");
        director.setDirectorBiography("nieznany");
        director.setDirectorDayOfBirth(LocalDate.of(1987,Month.JANUARY,1));

        doAnswer((Answer) invocation -> {
            Object arg = invocation.getArguments();
            System.out.println(arg);

            return arg;
        }).when(directorMapper).parametrizeInsertStatement(preparedStatement,director);

        doNothing().when(directorMapper).parametrizeInsertStatement(preparedStatement,director);
        doNothing().when(directorMapper).parametrizeUpdateStatement(preparedStatement,director);

        new DirectorRepository(connection).update(director);
    }




}
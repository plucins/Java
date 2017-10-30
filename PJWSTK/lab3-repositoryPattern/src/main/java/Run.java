import fields.TvSeries;
import repo.TvSeriesRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Run {

    public static void main(String[] args) {
        String url = "jdbc:mysql://sql.s13.vdl.pl/plucins_pjwstk";
        String username = "plucins_pjwstk";
        String password = "zaq1!QAZ";


        try(Connection connection = DriverManager.getConnection(url,username,password)) {

            TvSeriesRepository tv = new TvSeriesRepository(connection);

            TvSeries tvSeries1 = new TvSeries();

            tvSeries1 = tv.GetById(11);

            System.out.println(tvSeries1);



        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

import fields.TvSeries;
import repo.DirectorRepository;
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
            DirectorRepository d = new DirectorRepository(connection);

            TvSeries tvSeries1 = new TvSeries();
            tvSeries1.setName("cos");

            int key = tv.add(tvSeries1);

            System.out.println(key);



        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}

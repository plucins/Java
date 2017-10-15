import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

    Connection connection;
    private PreparedStatement getTvSeriesStatement;
    private PreparedStatement getSeasonStatement;

    String url = "jdbc:mysql://sql.s13.vdl.pl/plucins_pjwstk";
    String username = "plucins_pjwstk";
    String password = "zaq1!QAZ";

    public DBManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            getTvSeriesStatement = connection.prepareStatement("SELECT id,tvSeriesName FROM TvSeries");
            getSeasonStatement = connection.prepareStatement("SELECT * FROM Season");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getSeasonName() {
        int count = 1;
        try {
            ResultSet rs = getTvSeriesStatement.executeQuery();

            while (rs.next()) {
                System.out.println(count + ". " + rs.getString("tvSeriesName"));
                count++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public TvSeries getBreakingBadInfo() {
        List<Season> seasons = new ArrayList<Season>();
        TvSeries tv = null;
        try {
            ResultSet rs = getSeasonStatement.executeQuery();
            while (rs.next()) {
                Season s = new Season();
                s.setSeasonNumber(rs.getInt("seasonNumber"));
                s.setYearOfrelease(rs.getInt("seasonYearOfrelease"));
                seasons.add(s);
            }

            rs = getTvSeriesStatement.executeQuery();
            while (rs.next()) {
                if ((rs.getInt("id")) == 2) {
                    tv = new TvSeries();
                    tv.setName(rs.getString("tvSeriesName"));
                    tv.setSeasons(seasons);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tv;
    }


}

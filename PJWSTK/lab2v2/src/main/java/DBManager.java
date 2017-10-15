import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {

    Connection connection;
    private PreparedStatement getTvSeriesStatement;
    private PreparedStatement getSeasonStatement;
    private PreparedStatement getEpisodeStatement;

    public Season s;

    String url = "jdbc:mysql://sql.s13.vdl.pl/plucins_pjwstk";
    String username = "plucins_pjwstk";
    String password = "zaq1!QAZ";

    public DBManager() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            getTvSeriesStatement = connection.prepareStatement("SELECT * FROM TvSeries");
            getSeasonStatement = connection.prepareStatement("SELECT * FROM Season");
            getEpisodeStatement = connection.prepareStatement("SELECT * FROM Episode");

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

    public TvSeries getSeasonInfo() {
        List<Season> seasons = new ArrayList<>();
        TvSeries tv = null;
        try {
            ResultSet rs = getSeasonStatement.executeQuery();
            while (rs.next()) {
                if(rs.getInt("idTvSeries") == 2) {
                    s = new Season();
                    s.setSeasonNumber(rs.getInt("seasonNumber"));
                    s.setYearOfrelease(rs.getInt("seasonYearOfrelease"));
                    s.setId(rs.getInt("id"));
                    seasons.add(s);
                }
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

    public Season getEpisodInfo(TvSeries tv) {
        List<Episode> episodes = new ArrayList<>();
        try {
            ResultSet rs = getEpisodeStatement.executeQuery();
            while (rs.next()) {
                for(int i=0; i < tv.getSeasons().size();i++) {
                    if((tv.getSeasons().get(i).getId()) == (rs.getInt("idSeason"))) {
                        Episode e = new Episode();
                        e.setName(rs.getString("episodeName"));
                        e.setReleaseDate(rs.getDate("episodeReleaseDate").toLocalDate());
                        e.setEpisodeNumber(rs.getInt("episodeNumber"));
                        e.setDuration(rs.getString("episodeDuration"));
                        episodes.add(e);
                    }
                    else {
                        tv.getSeasons().get(i).setId(0);
                    }
                }
            }
            s.setEpisodes(episodes);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return s;
    }


}

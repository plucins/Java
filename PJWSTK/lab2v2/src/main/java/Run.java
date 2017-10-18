import java.sql.Connection;
import java.util.Scanner;

public class Run {

    Connection connection;

    public static void main(String[] args) {

        DBManager con = new DBManager();


        DataManager db = new DataManager(con.establishConnection());
        Scanner sc = new Scanner(System.in);
        TvSeries tv;


        System.out.println("Wybierz serial o którym chcesz się więcej dowiedzieć");
        System.out.println("Podaj jego ID");
        db.getSeasonName();
        int chose = sc.nextInt();
        sc.nextLine();

        System.out.println(db.getTvSeriesInfo(chose));
        System.out.println(db.getDirectorInfo(chose));
        System.out.println("Aktorzy: " + db.getActirInfo(chose).getActors());
        System.out.println("Sezony: " + db.getSeasonInfo().getSeasons());
        tv = db.getSeasonInfo();
        System.out.println("Odcinki: " + db.getEpisodInfo(tv).getEpisodes());
    }
}

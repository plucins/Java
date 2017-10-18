import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        DBManager db = new DBManager();
        Scanner sc = new Scanner(System.in);
        TvSeries tv;


        System.out.println("Wybierz serial o którym chcesz się więcej dowiedzieć");
        System.out.println("Podaj jego ID");
        db.getSeasonName();
        int chose = sc.nextInt();
        sc.nextLine();
        System.out.println(db.getDirectorInfo(chose));
        System.out.println(db.getTvSeriesInfo(chose));
        System.out.println(db.getSeasonInfo().getSeasons());
        tv = db.getSeasonInfo();
        System.out.println(db.getEpisodInfo(tv).getEpisodes());

//        switch(chose){
//            case 1:
//
//                break;
//            case 2:
//
//                break;
//
//            case 3:
//
//                break;
//
//            case 4:
//
//                break;
//
//            default:
//                System.out.println("Błędny wybór");
//        }
    }
}

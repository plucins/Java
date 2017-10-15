import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        DBManager db = new DBManager();
        Scanner sc = new Scanner(System.in);
        TvSeries tv = new TvSeries();

        System.out.println("Wybierz serial o którym chcesz się więcej dowiedzieć");
        tv = db.getBreakingBadInfo();
        System.out.println(tv.getSeasons());

//        int chose = sc.nextInt();
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

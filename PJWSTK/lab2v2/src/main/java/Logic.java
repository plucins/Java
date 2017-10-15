public class Logic {
    DBManager db = new DBManager();

    public void printInfo() {

         TvSeries object = db.getBreakingBadInfo();
         object.getName();
    }
}

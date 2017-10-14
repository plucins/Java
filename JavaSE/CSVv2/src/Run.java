import java.util.concurrent.TimeUnit;

public class Run {


    public static void main(String[] args) {
        try{
            FtpService ftp = new FtpService();
            FtpLoginData ftpData = new FtpLoginData();
            MySqlService mysql = new MySqlService();
            Lead lead = new Lead();
            Path path = new Path();

            ftp.connection(ftpData);
            mysql.establishDBConnection();

            while(true) {


                if(ftp.setLeadName(ftpData) == true) {
                    TimeUnit.MINUTES.sleep(15);
                    System.out.println("Czekam");
                }else {
                    ftp.downloadFile(ftpData);

                    CSVReader csv = new CSVReader(lead, ftpData);
                    mysql.addLeadToDB(lead);
                    csv.clearLeadObject(lead);
                    System.out.println("2sec sleep");
                    TimeUnit.SECONDS.sleep(2);
                    ftp.deleteFileFromFtp(ftpData);
                }
            }


        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

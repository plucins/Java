import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public  CSVReader(Lead lead, FtpLoginData ftpData) {


        String csvFile = ftpData.getFileNameFromFpf();
        String line = "";
        String csvSplitBy = ",";


        int iteration = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while((line = br.readLine()) != null){
                if(iteration == 0){
                    iteration++;
                    continue;
                }

                String[] values = line.split(csvSplitBy);


                lead.setCalculationNumber(values[0]);
                lead.setUg(values[1]);
                lead.setTelNumber(values[2]);
                lead.setCalculationLink(values[3]);
                lead.setClausules(values[4]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void clearLeadObject(Lead lead){
        lead.setCalculationNumber(null);
        lead.setUg(null);
        lead.setCalculationLink(null);
        lead.setCalculationLink(null);
        lead.setClausules(null);
    }
}

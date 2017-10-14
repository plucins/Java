import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class FtpService {

    FTPClient ftp = null;
    Path path = new Path();

    public void connection(FtpLoginData ftpData) throws Exception{

        ftp = new FTPClient();

        ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));

        int reply;
        ftp.connect(ftpData.getFtpServer());
        reply = ftp.getReplyCode();
        if(!FTPReply.isPositiveCompletion(reply)){
            ftp.disconnect();
            throw new Exception("Exception in connection to FTP Server");
        }

        ftp.login(ftpData.getFtpLogin(),ftpData.getFtpPassword());
        ftp.setFileType(FTP.BINARY_FILE_TYPE);
        ftp.enterLocalPassiveMode();

    }

    public void downloadFile(FtpLoginData ftpData){

        try(FileOutputStream fos = new FileOutputStream(path.getLocalPath()+ftpData.getFileNameFromFpf())){
                this.ftp.retrieveFile(path.getRemotePath()+ftpData.getFileNameFromFpf(),fos);
            }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void disconnect(){
        if(this.ftp.isConnected()){
            try{
                this.ftp.logout();
                this.ftp.disconnect();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    public boolean setLeadName(FtpLoginData ftpData) {
        boolean isNull = false;
        try {
            String[] file = ftp.listNames(path.getRemotePath());
            if(file.length == 2){
                isNull = true;

            }else {
                Arrays.sort(file);
                String name = file[2].substring(6);
                ftpData.setFileNameFromFpf(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isNull;
    }
        public void deleteFileFromFtp(FtpLoginData ftpData){
            try{
                ftp.deleteFile(path.getRemotePath()+ftpData.getFileNameFromFpf());
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        public boolean isNull(){
            boolean isnull = false;
            try {
                String[] files = ftp.listNames(path.getRemotePath());

                if (files[2] == null) {
                    isnull = true;
                }
            }catch(IOException e){
                e.printStackTrace();
            }
            return isnull;
        }




}



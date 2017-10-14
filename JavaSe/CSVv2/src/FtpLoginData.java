
public class FtpLoginData {
    private String ftpServer;
    private String ftpLogin;
    private String ftpPassword;

    private String fileNameFromFpf;

    public FtpLoginData() {
    }

    public String getFtpServer() {
        ftpServer = "";
        return ftpServer;
    }

    public String getFtpLogin() {
        ftpLogin = "";
        return ftpLogin;
    }


    public String getFtpPassword() {
        ftpPassword = "";
        return ftpPassword;
    }

    public String getFileNameFromFpf() {
        return fileNameFromFpf;
    }

    public void setFileNameFromFpf(String fileNameFromFpf) {
        this.fileNameFromFpf = fileNameFromFpf;
    }
}

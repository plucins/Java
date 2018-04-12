package controller;

import mapper.ObjectToDownloadMapper;
import model.ObjectToDownload;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;

public class FileController {

    public void downloadPointedFile(String url){
        Connection connection = new DatabaseConnectionController().establishConnection();
        ObjectToDownloadMapper mapper = new ObjectToDownloadMapper(connection);
        String fineName =  new FileController().getFileName(url);

        try {
            InputStream is = new URL(url).openStream();

            mapper.add(new ObjectToDownload(fineName,url, is));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private String getFileName(String url){
        String[] s = url.split("/");
        return s[s.length-1];
    }
}

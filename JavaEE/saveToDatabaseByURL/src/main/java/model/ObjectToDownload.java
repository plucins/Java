package model;

import mapper.DomainObject;

import java.io.InputStream;

public class ObjectToDownload implements DomainObject {
    private int id;
    private String fileName;
    private String url;
    private InputStream file;

    public ObjectToDownload() {
    }

    public ObjectToDownload(String fileName,String url, InputStream file) {
        this.fileName = fileName;
        this.url = url;
        this.file = file;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public InputStream getFile() {
        return file;
    }

    public void setFile(InputStream file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "ObjectToDownload{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                ", file=" + file +
                '}';
    }
}

package controller;

import model.ObjectToDownloadQueue;

public class ThreadController extends Thread {
    private ObjectToDownloadQueue queue = new ObjectToDownloadQueue();
    private FileController file = new FileController();

    @Override
    public void run() {
        if(!queue.isEmpty()){
            String url = queue.pickFromQueue();
            file.downloadPointedFile(url);
            this.run();
        }
    }
}

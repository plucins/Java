package model;

import java.util.LinkedList;
import java.util.Queue;

public class ObjectToDownloadQueue {
    private static Queue<String> queue = new LinkedList<>();


    public boolean addToQueue(String url){
        return queue.add(url);
    }

    public String pickFromQueue(){
        return queue.poll();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
}

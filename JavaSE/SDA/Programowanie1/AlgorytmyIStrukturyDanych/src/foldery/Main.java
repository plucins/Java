package foldery;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("../");
        File[] files = f.listFiles();

        printChild(f, " ");

    }

    static void printChild(File f, String odstep){

        if(f.isDirectory()){
            odstep += " ";
            System.out.println(odstep + f.getName());
            File[] files = f.listFiles();
            for(File file : files){
                printChild(file, odstep);
            }
        }else{
            System.out.println(odstep + f.getName());
        }
    }
}

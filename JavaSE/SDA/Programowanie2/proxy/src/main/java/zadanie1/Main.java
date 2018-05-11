package zadanie1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            IFileController fileController = new FileController("file");
            fileController.pominN(5);
            fileController.wczytajNLinii(4);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

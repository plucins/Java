package zadanie1;

import java.io.IOException;
import java.util.List;

public interface IFileController {

    List<String> wczytajNLinii(int ilosc) throws IOException;
    void pominN(int ilosc) throws IOException;
}

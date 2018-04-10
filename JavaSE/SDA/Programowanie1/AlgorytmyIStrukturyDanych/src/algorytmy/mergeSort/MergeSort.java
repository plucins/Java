package algorytmy.mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] tablica){
        mergeSort(tablica,0,tablica.length - 1);
    }

    public static void mergeSort(int[] tablica, int from, int to){
        if(from == to){
            return;
        }

        int indexSrodkowy = (from + to) / 2;
        mergeSort(tablica,from,indexSrodkowy);
        mergeSort(tablica,indexSrodkowy + 1,to);

        scal(tablica, from, indexSrodkowy, to);
    }

    private static void scal(int[] tablica, int from, int indexSrodkowy, int to) {

        int[] kopia = Arrays.copyOf(tablica,tablica.length);

        int indexPrawy = indexSrodkowy + 1;
        int indexLewy = from;

        int indexWstawiania = from;

        while(indexLewy != indexSrodkowy + 1 && indexPrawy <= to){
            if(kopia[indexLewy] < kopia[indexPrawy]){
                tablica[indexWstawiania] = kopia[indexLewy++];
            } else {
                tablica[indexWstawiania] = kopia[indexPrawy++];
            }
            indexWstawiania++;
        }

        while (indexLewy != indexSrodkowy + 1){
            tablica[indexWstawiania++] = kopia[indexLewy++];
        }

        while(indexPrawy <= to){
            tablica[indexWstawiania++] = kopia[indexPrawy++];
        }
    }


}
